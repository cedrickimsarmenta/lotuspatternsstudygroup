package com.patterns.decorator.pau.base;

import com.patterns.decorator.pau.Sandwich;

/**
 * Created by edgardopaulocunanan on 09/08/2017.
 */
public class Hamburger extends Sandwich {

    public Hamburger() {
        description = "Hamburger";
    }

    @Override
    public double getCost() {
        return 150;
    }

}
