package homework9;

public class Song {
    private String name;
    private String artist;
    private String album;
    private int track;
    private double length;

    public Song(String name, String artist, String album, int track, double length){
        this.name = name;
        this.artist = artist;
        this.album = album;
        this.track = track;
        this.length = length;
    }

    public Song() {
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getArtist(){
        return this.artist;
    }

    public void setArtist(String artist){
        this.artist = artist;
    }

    public String getAlbum(){
        return this.album;
    }

    public void setAlbum(String album){
        this.album = album;
    }

    public int getTrack(){
        return this.track;
    }

    public void setTrack(int track){
        this.track = track;
    }

    public double getLength(){
        return this.length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public void printInfo(){
        System.out.println(name + " played by " + artist + " from " + album + " with song length " + length);
    }
}
