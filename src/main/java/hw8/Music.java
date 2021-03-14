package hw8;

public class Music {

    public String artist;
    public String albumTitle;
    public String recordCompany;
    public int numRecordsSold;
    public int awardsEarned;

    public String getFavoriteMusic(){
        return "Your favorite musical artist is: " +artist+ "\nYour favorite album by " +artist+ " is: " +albumTitle;
    }
    public int getNumRecordsSold(){
        return numRecordsSold;
    }

    public String getProduction(){
        return "This artist is signed with: " +recordCompany+ "\nThis artist has won " +awardsEarned+ " awards.";
    }
}

