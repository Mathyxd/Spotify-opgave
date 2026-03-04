package model;

public class Free extends User {
    public Free(String name, String email) {super(name, email); }

    public void playSong() {System.out.println("Playing song: " + getTitle + "but first an AD"); }

}
