package com.patterns.decorator.lex;

public class PeperoPizzaMakerDecorator extends PizzaMakerDecorator  {

    public PeperoPizzaMakerDecorator(PizzaMaker toDecorate) {
        super(toDecorate);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("Adding Pepperoni!!!!");
    }
}
