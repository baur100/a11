package hwField;

public class Music {
    private String genre;
    private String artist;
    private int year;
    private boolean isGood;

    public String info(){
        return "This song was made in " + year + " by " + artist + " it's genre is " + genre;
    }

    public String getGenre(){
        return genre;
    }

    public String getArtist(){
        return artist;
    }

    public int year(){
        return year;
    }

    public boolean getisGood() {
        return isGood;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setArtist(String a){
        artist = a;
    }

    public void setYear(int y){
        year = y;
    }

    public void setisGood(boolean is){
        isGood = is;
    }

    public void getInfo(){
        System.out.println("The genre is " + genre + "\nThe artist is " + artist + "\nThe year is " + year + "\nThe album is good " + isGood);
    }

}
