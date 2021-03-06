package playlist;

import java.util.LinkedList;

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + " : " + this.duration;
    }

    public boolean addToPlaylist(LinkedList<Song> playList) {
        if (this != null) {
            playList.add(this);
            return true;
        }
        System.out.println("Error");
        return false;
    }
}
