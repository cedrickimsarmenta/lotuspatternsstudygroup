package com.patterns.flyweight.pau;

public class Metal extends Song {


    public Metal(Genre genre, String artist, String song) {
        super(genre, artist, song);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void play() {
       System.out.println("RAAAAAAAAAAAAAWWWWWWWRRRRRRRRRRRR");
       System.out.println("We are " + artist + "! Listen to our song of brutality!" + song);
    }
    
    
}
