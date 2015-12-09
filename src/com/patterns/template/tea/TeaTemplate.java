package com.patterns.template.tea;

public abstract class TeaTemplate {

    public final void makeTea(){
        prepareUtensils();
        putTeaBag();
        setBrewingTime();
        boilWater();
        System.out.println("your tea is ready! :)");
    }

    private void boilWater() {
        System.out.println("Boiling a water...");
    }

    public abstract void putTeaBag();
    public abstract void setBrewingTime();
 
    private void prepareUtensils() {
        System.out.println("Preparing the spoon, teacup and saucer");
    }
}