package com.patterns.flyweight.pau;

public class HipHop extends Song {
    
    
    

    public HipHop(Genre genre, String artist, String song) {
        super(genre, artist, song);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void play() {
       System.out.println("YO YO YO WAZZUP!?");
       System.out.println(artist + "spitting fire with bringing you " + song +"!");
    }
    
    
}
