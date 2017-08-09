package com.patterns.decorator.pau;

import com.patterns.decorator.pau.base.BahnMi;
import com.patterns.decorator.pau.base.Hamburger;
import com.patterns.decorator.pau.base.Subway;
import com.patterns.decorator.pau.decorators.Bacon;
import com.patterns.decorator.pau.decorators.Cheese;
import com.patterns.decorator.pau.decorators.Patty;
import com.patterns.decorator.pau.decorators.Veggies;

/**
 * Created by edgardopaulocunanan on 09/08/2017.
 */
public class Runner {

    public static void main(String[] args) {
        Sandwich burger = new Hamburger();
        burger = new Bacon(burger);
        burger = new Cheese(burger);
        burger = new Bacon(burger);
        System.out.println(burger.getDescription() + " " + burger.getCost());

        Sandwich bahnMi = new BahnMi();
        bahnMi = new Veggies(bahnMi);
        System.out.println(bahnMi.getDescription() + " " + bahnMi.getCost());

        Sandwich sub = new Bacon(new Cheese(new Patty(new Veggies(new Subway()))));
        System.out.println(sub.getDescription() + " " + sub.getCost());
    }
}
