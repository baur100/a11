package hwField;

public class Game {
    public String name;
    public String genre;
    public String platform;
    public int year;

    public Game(String name, String genre, String platform,int year){
        this.name=name;
        this.genre=genre;
        this.platform=platform;
        this.year=year;
    }

    public void rating(int review){
        System.out.println(name+" received a " + review + " out of 5 for it's score");
    }

    public void getInfo(){
        System.out.println("The Name is " + name + "\nThe Genre is " + genre + "\nThe platform is " + platform + "\nThe year is " + year);
    }
}
