package com.patterns.decorator.lex;

public class PineapplePizzaMakerDecorator extends PizzaMakerDecorator{

    public PineapplePizzaMakerDecorator(PizzaMaker toDecorate) {
        super(toDecorate);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("Adding Pineapple!!!!");
    }
}
