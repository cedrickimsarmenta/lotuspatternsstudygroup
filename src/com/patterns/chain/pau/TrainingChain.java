package com.patterns.chain.pau;

public abstract class TrainingChain {
    
    protected TrainingChain nextChain;
    
    protected final void setNextChain(TrainingChain nextChain) {
        this.nextChain = nextChain;
    }
    
    abstract void trainWarrior(Warrior warrior);
    
    protected void advanceTraining(Warrior warrior) {
        if(nextChain != null) {
            nextChain.trainWarrior(warrior);
        }
    }
}
