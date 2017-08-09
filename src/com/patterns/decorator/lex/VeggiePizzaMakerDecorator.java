package com.patterns.decorator.lex;

/**
 * Created by alexisbalderama on 09/08/2017.
 */
public class VeggiePizzaMakerDecorator extends PizzaMakerDecorator{

    public VeggiePizzaMakerDecorator(PizzaMaker toDecorate) {
        super(toDecorate);
    }

    @Override
    public void makePizza() {
        super.makePizza();
        System.out.println("Adding Gulay!!!!");
    }
}
