package com.patterns.decorator.pau.decorators;

import com.patterns.decorator.pau.Sandwich;

/**
 * Created by edgardopaulocunanan on 09/08/2017.
 */
public abstract class SandwichDecorator extends Sandwich {

    protected Sandwich target;

    public SandwichDecorator(Sandwich target) {
        this.target = target;
    }

    public abstract String getDescription();

}
