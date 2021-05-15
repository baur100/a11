package models;

public class PlaylistSongs {
    private int track;
    private String title;
    private String artist;
    private String album;

    public PlaylistSongs(int track, String title, String artist, String album) {
        this.track = track;
        this.title = title;
        this.artist = artist;
        this.album = album;
    }

    public int getTrack() {
        return track;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbum() {
        return album;
    }
}
