package com.patterns.memento.blessie;

/**
 * Created by blessie on 21/09/2017.
 */
public class CheckpointMemento {

    private String checkpoint;

    public CheckpointMemento(String checkpoint){
        this.checkpoint = checkpoint;
    }

    public String getCheckpoint() {
        return checkpoint;
    }
}
