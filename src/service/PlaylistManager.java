package service;

import model.Song;
import java.util.ArrayList;

public class PlaylistManager {
    private ArrayList<Song> songs;

    public PlaylistManager() {
        this.songs = new ArrayList<>();
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void displaySongs() {

    }
    public void removeSong(String title) {

    }
    public void searchSong(String title) {

    }
    public void editSong(String title) {

    }
    public void sortSongs() {

    }

}
