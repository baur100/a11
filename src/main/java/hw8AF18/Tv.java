package hw8AF18;

public class Tv {
    public String brand;
    public String model;
    public int diagonal;
    public double frame;
    public int price;

    public void infoTv(){
        System.out.println("The TV\nBrand-"+brand+" model-"+model
        +"\nDiagonal-"+diagonal+"\nPrice-"+price);
    }
    public double widthTv(){
        return diagonal*2.2+frame;   //This is not clear formula for the width of TV
    }
}
