package com.patterns.chain.pau;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Warrior {

    private String name;
    private Set<String> equipment = new HashSet<>();
    private int strength;
    private int agility;
    private int intelligence;
    
    public Warrior(String name) {
        this.name = name;
    }
    
    public void addStrength(int strength) {
        this.strength += strength;
    }
    
    public void addAgility(int agility) {
        this.agility += agility;
    }
    
    public void addIntelligence(int intelligence) {
        this.intelligence += intelligence;
    }

    public String getName() {
        return name;
    }

    public Set<String> getEquipment() {
        return Collections.unmodifiableSet(equipment);
    }

    public int getStrength() {
        return strength;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }
    
    public void addEquipment(String equipment) {
        this.equipment.add(equipment);
    }
    
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Warrior [name=");
        builder.append(name);
        builder.append(", equipment=");
        builder.append(equipment);
        builder.append(", strength=");
        builder.append(strength);
        builder.append(", agility=");
        builder.append(agility);
        builder.append(", intelligence=");
        builder.append(intelligence);
        builder.append("]");
        return builder.toString();
    }
}
