package com.patterns.memento;

public class ExampleMemento {
    private String name;
    private String description;
    public ExampleMemento(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    @Override
    public String toString(){
        String str="Current Memento State " + this.name +" , "+" , "+this.getDescription();
        return str;
    }
}