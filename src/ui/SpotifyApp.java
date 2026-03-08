package ui;

import service.PlaylistManager;
import filehandler.FileHandler;
import java.util.Scanner;

public class SpotifyApp {

    public static PlaylistManager manager = new PlaylistManager();
    public static FileHandler fileHandler = new FileHandler();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        private static void showMenu() {
            System.out.println("Velkommen til dit hjemmelavede Spotify!");
            System.out.println("1. Tilføj ny sang");
            System.out.println("2. Fjern en sang");
            System.out.println("3. Vis alle sange");
            System.out.println("4. Søg efter en sang");
            System.out.println("5. Rediger en sang");
            System.out.println("6. Sortér sanglisten");
            System.out.println("7. Afslut programmet");
        }
    }
}
