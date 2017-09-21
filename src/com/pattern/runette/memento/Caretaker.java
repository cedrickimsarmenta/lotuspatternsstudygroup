package com.pattern.runette.memento;



import java.util.HashMap;
import java.util.Map;

/**
 * Created by runetteorobia on 21/09/2017.
 */
public class Caretaker {

    private int counter;
    private Map<Integer, Person> people = new HashMap<>();

    public Caretaker() {
        counter = 1;
    }

    public void addState(Person m){
        people.put(counter, m);
        counter++;
    }

    public void removeState(int i) {
        people.remove(i);
    }

    public void printAllSavedState() {
        System.out.println("------MVPs------");
        for(Map.Entry<Integer, Person> entry : people.entrySet()){
            System.out.println("Month " + entry.getKey());
            entry.getValue().printMemento();
        }
        System.out.println("-------------------------");
    }

    public Person getState(int i){
        return people.get(i);
    }

}
