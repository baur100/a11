package Homework3_10;

public class Movie {
    private String name;
    private String directors;
    private String genres;
    private String formats;
    private int yearOfRelease;

    public void buget(int numbers){
        System.out.println(name+" "+directors+" "+genres+" "+yearOfRelease+" Budget: "+numbers+" million");
    }

    public Movie(String name,String directors,String genres,String formats,int yearOfRelease){
        this.name=name;
        this.directors=directors;
        this.genres=genres;
        this.formats=formats;
        this.yearOfRelease=yearOfRelease;
    }

    public Movie(){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDirectors(){
        return directors;
    }
    public void setDirectors(String directors){
        this.directors= directors;
    }
    public String getGenres(){
        return genres;
    }
    public void setGenres(String genres){
        this.genres=genres;
    }
    public String getFormats(){
        return formats;
    }
    public void setFormats(String formats){
        this.formats=formats;
    }
    public int getYearOfRelease(){
        return yearOfRelease;
    }
    public void setYearOfRelease(int yearOfRelease){
        this.yearOfRelease=yearOfRelease;
    }
}
