package filehandler;

import model.*;

import enums.*;

import java.io.*;

import java.util.ArrayList;

public class FileHandler {

    public void saveToFile(ArrayList<Song> songs) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("playlist.txt"))) {
            for (Song song : songs) {
                writer.write(song.getTitle() + "," + song.getArtist() + "," + song.getGenre());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        public ArrayList<Song> loadFromFile() {
            ArrayList<Song> songs = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader("playlist.txt"))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    String title = parts[0];
                    String artist = parts[1];
                    Genre genre = Genre.valueOf(parts[2]);
                    songs.add(new Song(title, genre, artist));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            return songs;
        }

    }
}
