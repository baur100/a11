package Homework3_9;

public class Shoes {
    public String gender;
    public String type;
    public String brand;
    public String color;
    public int size;

    public void forSell(int numbers){
        System.out.println("Type: "+type+", Brand: "+brand+", Gender: "+gender+", Color: "+color+", Size: "+size+" (Qty:"+numbers+")");
    }
}
