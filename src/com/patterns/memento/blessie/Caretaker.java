package com.patterns.memento.blessie;

import java.util.ArrayDeque;

/**
 * Created by blessie on 21/09/2017.
 */
public class Caretaker {

    private ArrayDeque<CheckpointMemento> checkpointMementos = new ArrayDeque<>();

    public void add(CheckpointMemento state){
        checkpointMementos.add(state);
        System.out.println("Player saved at "+state.getCheckpoint());
        // i added stuff here for the training :D
    }

    public CheckpointMemento pop(){
        return checkpointMementos.pop();
    }

}
