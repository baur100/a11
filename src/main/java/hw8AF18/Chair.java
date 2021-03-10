package hw8AF18;

public class Chair {
    public String model;
    public int price;
    public String material;


    public void infoChair(){
        System.out.println("The CHAIR\nThe model-"+model+"\nMade from best material-"+material
        +"\nPrice: "+price);
    }

    public double getPriceWithDiscount(double discount){
        return price*discount;
    }
}
