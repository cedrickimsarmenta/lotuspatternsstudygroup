package com.patterns.chain.pau;

public class LoneWolfAndCub extends TrainingChain {
    
    private static final int EQUIPMENT_BONUS_STAT = 5;
    private static final int STRENGTH_BOOST = 3;
    private static final int AGILITY_BOOST = 2;
    private static final String BONUS_EQUIPMENT = "Zanbato";
    
    @Override
    void trainWarrior(Warrior warrior) {
        System.out.println("LoneWolf: Welcome to Meifumado");
        warrior.addStrength(STRENGTH_BOOST);
        warrior.addAgility(AGILITY_BOOST);
        if(warrior.getStrength() > EQUIPMENT_BONUS_STAT) {
            warrior.addEquipment(BONUS_EQUIPMENT);
        }
        System.out.println(warrior);
        advanceTraining(warrior);
    }
    
}
