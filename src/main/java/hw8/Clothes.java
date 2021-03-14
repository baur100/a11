package hw8;

public class Clothes {
    public int size;
    public String color;
    public String brandName;
    public String storePurchased;
    public double price;


public String getStyle(){
    return "Your size: " +size +"\nYour preferred brand: " +brandName+ "\nYour best color: "+color;
}

public String getStore(){
    return "You found this style here: " +storePurchased;
}

public double getPrice(){
    return price;
}

}
