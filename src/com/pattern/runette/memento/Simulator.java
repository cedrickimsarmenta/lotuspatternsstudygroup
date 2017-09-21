package com.pattern.runette.memento;



/**
 * Created by runetteorobia on 21/09/2017.
 */
public class Simulator {

    public static void main(String[] args) {

        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        //initial
        originator.setState(25, "net");
        caretaker.addState(originator.saveToPerson());

        //updates
        originator.setState(32, "may");
        originator.setState(12, "april");
        originator.setState(22, "june");
        caretaker.addState(originator.saveToPerson());


        originator.setState(50, "voldemort");
        caretaker.printAllSavedState();

        System.out.println("------Current MVP------");
        originator.printState();

        originator.restoreStateFromMemento(caretaker.getState(1));
        System.out.println("------MVP after suspension------");
        originator.printState();

    }

}
