package com.patterns.decorator.lex;

public class BasicPizzaMaker implements PizzaMaker {

    private String ingredients;
    private int size;
    private boolean thickCrust;

    public BasicPizzaMaker(int size, boolean thickCrust) {
        this.size = size;
        this.thickCrust = thickCrust;
    }

    @Override
    public void makePizza() {
        System.out.println("Creating " + size + " inch " + (thickCrust ? "thick" : "thin") + "crust pizza");
        System.out.println("Adding Cheese!!!!");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isThickCrust() {
        return thickCrust;
    }

    public void setThickCrust(boolean thickCrust) {
        this.thickCrust = thickCrust;
    }
}
