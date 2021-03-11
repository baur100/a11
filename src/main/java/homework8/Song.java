package homework8;

public class Song {
    public String name;
    public String artist;
    public String album;
    public int track;

    public void nowPlaying(){
        System.out.println("Now playing: " + name + "...");
    }

    public void songInfo(){
        System.out.println("Track #" + track + " from " + album + " by " + artist);
    }
}
