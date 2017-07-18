package com.lambda.csv;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Inherited
public @interface CsvField {
    public String header();
    public CsvObjectTypes type() default CsvObjectTypes.STRING;
    public int order();
    public boolean required() default false;
}
