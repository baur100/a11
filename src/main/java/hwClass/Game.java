package hwClass;

public class Game {
    public String name;
    public String genre;
    public String platform;
    public int year;

    public void rating(int review){
        System.out.println(name+" received a " + review + " out of 5 for it's score");
    }
}
