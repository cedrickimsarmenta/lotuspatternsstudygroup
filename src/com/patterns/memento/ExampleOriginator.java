package com.patterns.memento;

public class ExampleOriginator {
    private String Name;
    private String Description;
    public ExampleOriginator(String Name, String Description)
    {
        this.Name = Name;
        this.Description = Description;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getDescription() {
        return Description;
    }
    public void setDescription(String description) {
        this.Description = description;
    }
    public ExampleMemento saveToMemento() {
        ExampleMemento exampleMemento=new ExampleMemento(this.Name, this.Description);
        return exampleMemento;
    }
    public void undoFromMemento(ExampleMemento memento)
    {
        this.Name = memento.getName();
        this.Description = memento.getDescription();
    }
    public void printInfo()
    {
        System.out.println("Name: "+ this.Name);
        System.out.println("Description: "+ this.Description);
    }
}