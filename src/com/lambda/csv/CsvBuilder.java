package com.lambda.csv;



import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static com.lambda.csv.CsvObjectTypes.MONEY;
import static com.lambda.csv.CsvObjectTypes.DATE;


public class CsvBuilder {
    private final static String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
    private final static String DEFAULT_NULL_VALUE = "";
    private final static String DEFAULT_DELIMITER= ",";
    private DateFormat dateFormat;
    private String nullValue;
    private String delimiter;
    private Map<CsvObjectTypes, Function<Object, String>> functionMap = new EnumMap<CsvObjectTypes, Function<Object, String>>(CsvObjectTypes.class);

    public  CsvBuilder(){
        setDefaults();
    }

    public DateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(DateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }


    public String getNullValue() {
        return nullValue;
    }

    public void setNullValue(String nullValue) {
        this.nullValue = nullValue;
    }

    public void setCsvObjectTypeOperation(CsvObjectTypes key, Function<Object, String> function){
        functionMap.put(key, function);
    }

    public <T> File buildCsvFile(Class<T> beanClass, List<T> beanList, String directory, String fileName, boolean buildHeaders) throws IOException {
        Map<CsvField, Field> fieldMap = getFieldMap(beanClass);
        FileWriter fw = null;
        BufferedWriter bw = null;
        File file = null;
        try {
            File directoryFolder = new File(directory);
            if (!directoryFolder.exists()) {
                directoryFolder.mkdirs();
            }

            fileName = directory.concat(fileName);
            file = new File(fileName);

            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            if(buildHeaders){
                bw.write(fieldMap.keySet().stream().map(CsvField::header).collect(Collectors.joining(delimiter)));
                bw.write("\r\n");
            }
            for (T beanInstance : beanList) {
                bw.write(buildCsvRow(fieldMap, beanInstance));
                bw.write("\r\n");
            }
        } finally {
            bw.close();
            fw.close();
        }


        return file;
    }
    public <T> String buildCsvRow(Map<CsvField, Field> fieldMap, T beanInstance)  {
        List<String> values = new ArrayList<>();
        for(Map.Entry<CsvField, Field> entry: fieldMap.entrySet()){
            try {
                Field field = entry.getValue();
                CsvField csvField = entry.getKey();
                Object objValue = new PropertyDescriptor(field.getName(), beanInstance.getClass()).getReadMethod().invoke(beanInstance);
                String fieldValue = null;
                if (objValue == null){
                    values.add(nullValue);
                    continue;
                }
                Function<Object, String> operation = functionMap.get(csvField.type());
                fieldValue = operation != null ? operation.apply(objValue) : objValue.toString();
                values.add(fieldValue);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IntrospectionException e) {
                e.printStackTrace();
            }

        }
        return String.join(delimiter, values);
    }


    public void setDefaults(){
        if(dateFormat == null){
            dateFormat = new SimpleDateFormat(DEFAULT_DATE_FORMAT);
        }
        if(nullValue == null){
            nullValue = DEFAULT_NULL_VALUE;
        }
        if(delimiter == null){
            delimiter = DEFAULT_DELIMITER;
        }
        if(!functionMap.containsKey(MONEY)){
            functionMap.put(MONEY, o -> o instanceof BigDecimal ? ((BigDecimal) o).setScale(2, RoundingMode.HALF_DOWN).toString() : o.toString());
        }
        if(!functionMap.containsKey(DATE)){
            functionMap.put(DATE, o -> o instanceof  Date ? dateFormat.format((Date) o) : o.toString());
        }
    }

    public static <T> Map<CsvField, Field> getFieldMap(Class<T> beanClass){
        Map<CsvField, Field> fieldMap = new TreeMap<CsvField, Field>(Comparator.comparing(CsvField::order));
        for(Field field : beanClass.getDeclaredFields()){
            if(field.isAnnotationPresent(CsvField.class)){
                CsvField csvField = field.getAnnotationsByType(CsvField.class)[0];
                fieldMap.put(csvField, field);
            }
        }
        return fieldMap;
    }

    public static void main(String args[]){
        CsvBuilder csvBuilder = new CsvBuilder();
        csvBuilder.setDefaults();

    }

}
