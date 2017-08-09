package com.patterns.decorator.lex;

public class HamPizzaMakerDecorator extends PizzaMakerDecorator {

    public HamPizzaMakerDecorator(PizzaMaker toDecorate) {
        super(toDecorate);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("Add Ham!!!!");
    }
}
