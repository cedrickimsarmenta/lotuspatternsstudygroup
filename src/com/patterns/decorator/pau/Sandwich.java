package com.patterns.decorator.pau;

/**
 * Created by edgardopaulocunanan on 09/08/2017.
 */
public abstract class Sandwich {

    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract double getCost();
}
