package com.patterns.memento.blessie;

/**
 * Created by blessie on 21/09/2017.
 */
public class Originator {
    private String state;

    public void setState(String state){
        this.state = state;
        System.out.println("State: "+state);
    }

    public String getState(){
        return state;
    }

    public CheckpointMemento saveStateToMemento(){
        return new CheckpointMemento(state);
    }

    public void getStateFromMemento(CheckpointMemento memento){
        state = memento.getCheckpoint();
    }
}