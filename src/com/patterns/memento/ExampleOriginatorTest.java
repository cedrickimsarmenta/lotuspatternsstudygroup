package com.patterns.memento;

public class ExampleOriginatorTest {

    public void testMemento()  {
        ExampleOriginator exampleOriginator = new ExampleOriginator("Name", "Description");
        ExampleMemento exampleMemento= exampleOriginator.saveToMemento();
        ExampleCaretaker exampleCaretaker =new ExampleCaretaker();
        exampleCaretaker.addMemento(exampleMemento);
        System.out.println("Original");
        exampleOriginator.printInfo();
        System.out.println("update name");
        exampleOriginator.setName("Another Name");
        exampleMemento= exampleOriginator.saveToMemento();
        exampleCaretaker.addMemento(exampleMemento);
        exampleOriginator.printInfo();
        System.out.println("update description");
        exampleOriginator.setDescription("Another Description");
        exampleMemento= exampleOriginator.saveToMemento();
        exampleCaretaker.addMemento(exampleMemento);
        exampleOriginator.printInfo();
        System.out.println("undoing description update");
        exampleMemento= exampleCaretaker.getMemento();
        exampleOriginator.undoFromMemento(exampleMemento);
        exampleMemento= exampleCaretaker.getMemento();
        exampleOriginator.undoFromMemento(exampleMemento);
        exampleOriginator.printInfo();
        System.out.println("undoing name update");
        exampleMemento= exampleCaretaker.getMemento();
        exampleOriginator.undoFromMemento(exampleMemento);
        exampleOriginator.printInfo();
    }

    public static void main(String[] args) {
        ExampleOriginatorTest test = new ExampleOriginatorTest();
        test.testMemento();
    }
}