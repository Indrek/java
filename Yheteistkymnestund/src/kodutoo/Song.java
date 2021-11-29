package kodutoo;

import java.util.LinkedList;
import java.util.List;

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

    //kodutöö ül
    public boolean addToPlaylist(List<Song> playList) {
        if (this != null) {
            playList.add(this);
            return true;
        }
        System.out.println("Error");
        return false;
    }

}
