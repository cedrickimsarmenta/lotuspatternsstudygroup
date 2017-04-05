package com.patterns.chain.pau;

public class TestYourMight {
    
    public static void main(String[] args) {
        TrainingChain chain1 = new GatesOfKunLun();
        TrainingChain chain2 = new LoneWolfAndCub();
        TrainingChain chain3 = new ConstantineTheHellblazer();
        TrainingChain chain4 = new MasterTenzin();
        TrainingChain chain5 = new TheTrialOfShouLou();
        
        chain1.setNextChain(chain2);
        chain2.setNextChain(chain3);
        chain3.setNextChain(chain4);
        chain4.setNextChain(chain5);
        chain5.setNextChain(chain1);
        
        Warrior warrior = new Warrior("The Corinthian");
        chain1.trainWarrior(warrior);
        System.out.println(warrior);
    }
}
