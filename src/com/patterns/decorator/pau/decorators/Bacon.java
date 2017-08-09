package com.patterns.decorator.pau.decorators;

import com.patterns.decorator.pau.Sandwich;

/**
 * Created by edgardopaulocunanan on 09/08/2017.
 */
public class Bacon extends SandwichDecorator {

    public Bacon(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public String getDescription() {
        return target.getDescription() + ", Bacon";
    }

    @Override
    public double getCost() {
        return target.getCost() + 10;
    }
}
