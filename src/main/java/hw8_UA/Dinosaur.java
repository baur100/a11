package hw8_UA;

public class Dinosaur {
    public String name;
    public String color;
    public String diet;
    public int height;
    public int width;

    public void getDinoInfo(){
        System.out.println(name + " were " + diet + "." + "\nThey were known to be up to " + height + " feet tall and approximately " + width + " feet wide." + "\nThey were normally " + color + " color.");
    }
}
