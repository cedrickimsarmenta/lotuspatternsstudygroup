package com.patterns.flyweight.pau;

import java.util.HashSet;
import java.util.Set;

public class SongPlayer {
    
    private static Set<Song> playList = new HashSet<>();
    
    private static synchronized Song getSong(Genre genre, String artist, String title) {
        for(Song song : playList) {
            if(genre == song.getGenre() && artist.equals(song.getArtist()) && title.equals(song.getSong())) {
                return song;
            }
        }
        switch(genre) {
            case HIPHOP: Song hiphop = new HipHop(genre, artist, title); playList.add(hiphop);return hiphop;
            case METAL: Song metal = new Metal(genre, artist, title); playList.add(metal);return metal;
            case POP: Song pop = new Pop(genre, artist, title); playList.add(pop);return pop;
        }
        return null;
    }
    
    public static void main(String[] args) {
        getSong(Genre.METAL, "Slipknot", "Left Behind").play();
        getSong(Genre.HIPHOP, "D12", "Purple Hills").play();
        getSong(Genre.POP, "JESSI J", "BENG BENG").play();
        getSong(Genre.METAL, "Slipknot", "Left Behind").play();
        getSong(Genre.HIPHOP, "EMINEM", "WITHOUT ME").play();
        getSong(Genre.POP, "JESSI J", "BENG BENG").play();
        getSong(Genre.METAL, "Mushroom Head", "qwerty").play();
        getSong(Genre.HIPHOP, "EMINEM", "WITHOUT ME").play();
        getSong(Genre.POP, "JESSI J", "BENG BENG").play();
        
    }
}

