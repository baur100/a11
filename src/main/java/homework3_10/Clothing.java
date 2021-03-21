package homework3_10;

public class Clothing {
    private String gender;
    private String type;
    private String brand;
    private String seller;
    private String size1;
    private int size2;
    private double price;

    public void soldout(int numbers){
        System.out.println("Qty: "+numbers+" "+gender+" "+type+" "+brand+" "+seller+size1+price+" were sold"+" last month");
    }

    public Clothing(String gender, String type, String brand, String seller, String size, double price) {
        this.gender = gender;
        this.type = type;
        this.brand = brand;
        this.seller = seller;
        this.size1 = size;
        this.price = price;
    }

    public Clothing() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public String getSize1(){
        return size1;
    }
    public void setSize1(String size){
        this.size1=size;
    }

    public int getSize2() {
        return size2;
    }

    public void setSize2(int size) {
        this.size2 = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
