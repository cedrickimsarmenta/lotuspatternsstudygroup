package com.patterns.decorator.lex;

public class BaconPizzaMakerDecorator extends PizzaMakerDecorator {

    public BaconPizzaMakerDecorator(PizzaMaker toDecorate) {
        super(toDecorate);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("Add Bacon!!!!");
    }
}
