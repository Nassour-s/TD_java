import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Playlist {
    private final String name;
    private final List<String> tracks;

    public Playlist(String name) {
        this.name = name;
        this.tracks = new ArrayList<>();
    }

    public void addTrack(String track) {
        tracks.add(track);
    }

    public int size() {
        return tracks.size();
    }

    public List<String> getTracks() {
        return Collections.unmodifiableList(tracks); 
    }

    public static void main(String[] args) {
        Playlist p = new Playlist("Ma playlist");
        p.addTrack("Blablabla Tralala");
        p.addTrack("Tralala Blablabla");
        System.out.println("Tracks : " + p.getTracks());
    }
}