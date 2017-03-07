package com.patterns.flyweight.pau;

abstract class Song {
    
    protected String artist;
    protected String song;
    protected Genre genre;
    

    public Song(Genre genre, String artist, String song) {
        super();
        this.artist = artist;
        this.song = song;
        this.genre = genre;
    }



    public String getArtist() {
        return artist;
    }



    public String getSong() {
        return song;
    }



    public Genre getGenre() {
        return genre;
    }



    abstract void play();



    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((artist == null) ? 0 : artist.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((song == null) ? 0 : song.hashCode());
        return result;
    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Song other = (Song) obj;
        if (artist == null) {
            if (other.artist != null)
                return false;
        } else if (!artist.equals(other.artist))
            return false;
        if (genre != other.genre)
            return false;
        if (song == null) {
            if (other.song != null)
                return false;
        } else if (!song.equals(other.song))
            return false;
        return true;
    }



    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Song [artist=");
        builder.append(artist);
        builder.append(", song=");
        builder.append(song);
        builder.append(", genre=");
        builder.append(genre);
        builder.append("]");
        return builder.toString();
    }

    
    
}
