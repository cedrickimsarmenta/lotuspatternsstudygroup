package com.patterns.decorator.pau.base;

import com.patterns.decorator.pau.Sandwich;

/**
 * Created by edgardopaulocunanan on 09/08/2017.
 */
public class BahnMi extends Sandwich {

    public BahnMi() {
        description = "BahnMi";
    }

    @Override
    public double getCost() {
        return 200;
    }
}
