package com.pattern.runette.memento;



/**
 * Created by runetteorobia on 21/09/2017.
 */
public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printMemento() {
        System.out.println(String.format("Person: [NAME: %s, AGE: %d]", getName(), getAge()));
    }

}
