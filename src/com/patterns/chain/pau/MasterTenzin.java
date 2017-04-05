package com.patterns.chain.pau;

public class MasterTenzin extends TrainingChain {
    
    @Override
    void trainWarrior(Warrior warrior) {
        if(warrior.getAgility() >= 6) {
            System.out.println("Master Tenzin: Only in our lowest point are we most open for change");
            warrior.addAgility(6);
            warrior.addIntelligence(2);
            if(warrior.getAgility() > 10) {
                warrior.addEquipment("Air Bender's Boots");
            }
            System.out.println(warrior);
        }
        advanceTraining(warrior);
    }
    
}
