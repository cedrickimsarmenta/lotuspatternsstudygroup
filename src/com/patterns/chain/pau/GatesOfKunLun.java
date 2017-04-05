package com.patterns.chain.pau;

import java.util.Random;

public class GatesOfKunLun extends TrainingChain {
    
    @Override
    void trainWarrior(Warrior warrior) {
        System.out.println("Test your Might!");
        Random random = new Random();
        int strength = random.nextInt(6) + 1;
        int agi = random.nextInt(6) + 1;
        int intelligence = random.nextInt(6) + 1;
        warrior.addAgility(agi);
        warrior.addIntelligence(intelligence);
        warrior.addStrength(strength);
        System.out.println(warrior);
        advanceTraining(warrior);
    }
    
}
