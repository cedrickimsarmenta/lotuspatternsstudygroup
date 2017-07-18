package com.lambda.csv;

import java.io.*;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;


/**
 * Created by diannesolano on 18/07/2017.
 */
public class Test {

    List<SampleBean> sampleBeans;
    String directory = "/Users/diannesolano/Documents/";
    String fileName = "test.csv";
    Map<CsvField, Field> fieldMap = CsvBuilder.getFieldMap(SampleBean.class);
    String expectedOutput;



    private void createBeanList(){
        List<SampleBean> sampleBeanList = new ArrayList<>();
        SampleBean sampleBean = new SampleBean();
        sampleBean.setAccountId(1);
        sampleBean.setMobileNo("639878889876");
        sampleBean.setBalance(BigDecimal.valueOf(100));
        sampleBean.setSampleDate(new Date("01/01/1977"));
        sampleBean.setUserName("user1");
        sampleBeanList.add(sampleBean);
        sampleBean = new SampleBean();
        sampleBean.setAccountId(2);
        sampleBean.setMobileNo("639108765432");
        sampleBean.setBalance(BigDecimal.valueOf(767));
        sampleBean.setSampleDate(new Date("01/05/1980"));
        sampleBean.setUserName("user.2");
        sampleBeanList.add(sampleBean);
        sampleBeans = sampleBeanList;

    }

    public void writeBeanToCsv()
    {
        CsvBuilder csvBuilder = new CsvBuilder();
        SampleBean sampleBean = sampleBeans.get(0);
        String beanCsv = csvBuilder.buildCsvRow(csvBuilder.getFieldMap(SampleBean.class), sampleBean);
        System.out.println(beanCsv);
    }

    public void writeCsvWithDateFormat()
    {
        CsvBuilder csvBuilder = new CsvBuilder();
        csvBuilder.setDateFormat(new SimpleDateFormat("MM-dd-yy"));
        SampleBean sampleBean = sampleBeans.get(0);
        String beanCsv = csvBuilder.buildCsvRow(csvBuilder.getFieldMap(SampleBean.class), sampleBean);
        System.out.println(beanCsv);
    }

    public void writeCsvWithTypeOperations()
    {
        CsvBuilder csvBuilder = new CsvBuilder();
        // Replace dot (.) with underscore(_) for STRING type
        csvBuilder.setCsvObjectTypeOperation(CsvObjectTypes.STRING, o -> o.toString().replaceAll("\\.", "_"));
        // Append zero to numeric values
        csvBuilder.setCsvObjectTypeOperation(CsvObjectTypes.NUMERIC, o -> "0" + o.toString());
        SampleBean sampleBean = sampleBeans.get(1);
        String beanCsv = csvBuilder.buildCsvRow(csvBuilder.getFieldMap(SampleBean.class), sampleBean);
        System.out.println(beanCsv);
    }

    public void writeBeanListToCsv() throws IOException {
        CsvBuilder csvBuilder = new CsvBuilder();
        // Replace dot (.) with underscore(_) for STRING type
        csvBuilder.setCsvObjectTypeOperation(CsvObjectTypes.STRING, o -> o.toString().replaceAll("\\.", "_"));
        csvBuilder.buildCsvFile(SampleBean.class, sampleBeans, directory, fileName, true);
    }


    public static void main(String[] args) {

        Test test = new Test();
        test.createBeanList();
        test.writeBeanToCsv();
        test.writeCsvWithDateFormat();
        test.writeCsvWithTypeOperations();
        try {
            test.writeBeanListToCsv();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
