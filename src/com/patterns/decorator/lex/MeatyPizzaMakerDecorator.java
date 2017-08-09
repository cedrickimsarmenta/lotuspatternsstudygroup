package com.patterns.decorator.lex;


public class MeatyPizzaMakerDecorator extends PizzaMakerDecorator {

    public MeatyPizzaMakerDecorator(PizzaMaker toDecorate) {
        super(toDecorate);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("Adding Maraming Karne!!!!");
    }
}

