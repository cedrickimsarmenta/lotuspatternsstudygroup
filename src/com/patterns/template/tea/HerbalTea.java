package com.patterns.template.tea;

public class HerbalTea extends TeaTemplate {
 
    @Override
    public void putTeaBag() {
        System.out.println("put the tea bag with herbs and spices");
    }
 
    @Override
    public void setBrewingTime() {
        System.out.println("leave your herbal tea for about 3 - 5 minutes");
    }
 
}