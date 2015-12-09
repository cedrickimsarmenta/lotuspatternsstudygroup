package com.patterns.template.tea;

public class GreenTea extends TeaTemplate {
 
    @Override
    public void putTeaBag() {
        System.out.println("put the tea bag with leafy green shrubs from malunggay plant");
    }
 
    @Override
    public void setBrewingTime() {
        System.out.println("leave your tea for about 1 - 3 minutes");
    }
 
}