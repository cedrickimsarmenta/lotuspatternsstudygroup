package com.patterns.chain.pau;

public class TheTrialOfShouLou extends TrainingChain {
    
    @Override
    void trainWarrior(Warrior warrior) {
        if(warrior.getStrength() < 7 || warrior.getAgility() < 6 || warrior.getIntelligence() < 5) {
            System.out.println("ShouLou the Undying: You're not worthy! Train some more!");
            advanceTraining(warrior);
        } else {
            System.out.println("Shou Lou The Undying: Go forth and fight, world warrior!");
        }
    }
    
}
