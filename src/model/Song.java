package model;

import enums.Genre;

public class Song {
    private String title;
    private Genre genre;
    private String artist;

    public Song(String title, Genre genre, String artist) {
        this.title = title;
        this.genre = genre;
        this.artist = artist;
    }

    public String getTitle() { return title; }

    public void setTitle() {this.title = title;}

    public Genre getGenre() {return genre;}

    public void setGenre() {this.genre = genre;}

    public String getArtist() {return artist;}

    public void setArtist() {this.artist = artist;}
}

