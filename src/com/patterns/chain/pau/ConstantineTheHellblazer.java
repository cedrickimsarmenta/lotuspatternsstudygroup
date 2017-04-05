package com.patterns.chain.pau;

public class ConstantineTheHellblazer extends TrainingChain {
    
    private static final int INTELLIGENCE_BOOST = 4;
    private static final String BONUS_EQUIPMENT = "Sandman's Pouch";
    
    @Override
    void trainWarrior(Warrior warrior) {
        if(warrior.getIntelligence() >= 3) {
            System.out.println("John Constantine: Fancy a walk on the dark side, mate?");
            warrior.addIntelligence(INTELLIGENCE_BOOST);
            if(warrior.getIntelligence() > 8) {
                warrior.addEquipment(BONUS_EQUIPMENT);
            }
            System.out.println(warrior);
        }
        advanceTraining(warrior);
    }
    
}
