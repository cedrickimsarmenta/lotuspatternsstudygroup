package com.pattern.runette.memento;

/**
 * Created by runetteorobia on 21/09/2017.
 */
public class Originator {

    private int age;
    private String name;

    public void setState(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person saveToPerson() {
        return new Person(age, name);
    }

    public void printState() {
        System.out.println(String.format("Person: [NAME: %s, AGE: %d]", name, age));
    }

    public void restoreStateFromMemento(Person p) {
        this.age = p.getAge();
        this.name = p.getName();
    }

}
