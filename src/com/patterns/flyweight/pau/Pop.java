package com.patterns.flyweight.pau;

public class Pop extends Song {


    public Pop(Genre genre, String artist, String song) {
        super(genre, artist, song);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void play() {
       System.out.println("I SUCK");
       System.out.println("I am" + artist + ". And I make money of off " + song);
    }
    
    
}
