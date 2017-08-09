package com.patterns.decorator.pau.base;

import com.patterns.decorator.pau.Sandwich;

/**
 * Created by edgardopaulocunanan on 09/08/2017.
 */
public class Subway extends Sandwich {

    public Subway() {
        description = "Subway";
    }

    @Override
    public double getCost() {
        return 99;
    }
}
