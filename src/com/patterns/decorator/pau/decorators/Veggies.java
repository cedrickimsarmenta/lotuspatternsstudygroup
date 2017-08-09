package com.patterns.decorator.pau.decorators;

import com.patterns.decorator.pau.Sandwich;

/**
 * Created by edgardopaulocunanan on 09/08/2017.
 */
public class Veggies extends SandwichDecorator {

    public Veggies(Sandwich target) {
        super(target);
    }

    @Override
    public double getCost() {
        return target.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return target.getDescription() + ", Veggies";
    }
}
