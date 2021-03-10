package hwClass;

public class Music {
    public String genre;
    public String artist;
    public int year;
    public boolean isGood;

    public String info(){
        return "This song was made in " + year + " by " + artist + " it's genre is " + genre;
    }
}
