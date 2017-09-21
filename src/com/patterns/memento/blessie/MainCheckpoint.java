package com.patterns.memento.blessie;

/**
 * Created by blessie on 21/09/2017.
 */
public class MainCheckpoint {

    public static void main(String[] args){
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setState("Stage 1");
        originator.setState("Stage 2");
        originator.setState("Stage 3");
        caretaker.add(originator.saveStateToMemento());

        originator.setState("Stage 4");
        originator.setState("Character died");
        originator.getStateFromMemento(caretaker.pop());
        System.out.println("Final state: "+originator.getState());

    }
}
