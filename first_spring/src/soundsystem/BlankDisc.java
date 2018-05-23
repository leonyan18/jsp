package soundsystem;

import java.util.List;

public class BlankDisc implements CompactDisc {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }
    public BlankDisc() {
    }
    @Override
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
        for (String track:tracks){
            System.out.println("-Track: "+track);
        }
    }
    public  void playTrack(int pos){
        System.out.println(tracks.get(pos));
    }
}
