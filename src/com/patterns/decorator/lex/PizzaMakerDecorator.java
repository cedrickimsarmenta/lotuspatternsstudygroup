package com.patterns.decorator.lex;

public abstract class PizzaMakerDecorator implements PizzaMaker {

    protected PizzaMaker pizzaMaker;

    public PizzaMakerDecorator(PizzaMaker toDecorate) {
        this.pizzaMaker = toDecorate;
    }

    public void makePizza() {
        pizzaMaker.makePizza();
    }
}
