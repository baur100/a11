package homework3_9;

public class Smartphone {
    public String brand;
    public String model;
    public String color;
    public double screenSize;
    public int releaseDate;

    public void soldout(int numbers){
        System.out.println("Qty: "+numbers+" "+brand+" "+model+" "+color+" "+screenSize+" were sold"+" last month");
    }

}
