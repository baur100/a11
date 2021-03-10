package Homework3_9;

public class Song {
    public String name;
    public String artist;
    public String genre;
    public int releaseDate;
    public boolean statusPlay;
    public String play;
    public String pause;

    public String getSongInfo(){
        return "Song: "+name+"\nArtist: "+artist+"\nGenre: "+genre+"\nRelease date: "+releaseDate;
    }
    public String getStatus() {
        if (statusPlay) {
            return play;
        }
        return pause;
    }
}
