package com.patterns.decorator.lex;

public class PitsaHat {

    public static void main(String[] args) {
        PizzaMaker hamEnCheese = new HamPizzaMakerDecorator(new BasicPizzaMaker(18, true));
        System.out.println("HAMenCHEESE");
        hamEnCheese.makePizza();
        System.out.println();

        PizzaMaker baconEnCheese = new BaconPizzaMakerDecorator(new BasicPizzaMaker(12, false));
        System.out.println("BaconEnCheese");
        baconEnCheese.makePizza();
        System.out.println();

        PizzaMaker hawayan = new PineapplePizzaMakerDecorator(new HamPizzaMakerDecorator(new BasicPizzaMaker(12, false)));
        System.out.println("HAWAYAN");
        hawayan.makePizza();
        System.out.println();

        PizzaMaker pepperony = new PeperoPizzaMakerDecorator(new BasicPizzaMaker(12, true));
        System.out.println("Pepperony");
        pepperony.makePizza();
        System.out.println();

        PizzaMaker gulay = new VeggiePizzaMakerDecorator(new BasicPizzaMaker(12, true));
        System.out.println("Gulay");
        gulay.makePizza();
        System.out.println();

        PizzaMaker meatLovers = new MeatyPizzaMakerDecorator(new PeperoPizzaMakerDecorator(new BaconPizzaMakerDecorator(new HamPizzaMakerDecorator(new BasicPizzaMaker(36, true)))));
        System.out.println("Meat Lovers");
        meatLovers.makePizza();
        System.out.println();

        PizzaMaker superSupreme = new MeatyPizzaMakerDecorator(new PeperoPizzaMakerDecorator(new BaconPizzaMakerDecorator(new VeggiePizzaMakerDecorator(new HamPizzaMakerDecorator(new BasicPizzaMaker(18, false))))));
        System.out.println("Super Supreme");
        superSupreme.makePizza();
        System.out.println();
    }
}
