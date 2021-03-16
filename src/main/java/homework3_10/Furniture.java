package homework3_10;

public class Furniture {
    private String type;
    private String color;
    private double price;
    private int qty;

    public String getFurnitureInfo(){
        return "Furniture: "+type+"\nColor: "+color+"\nPrice: "+price+"\nOty: "+qty;
    }

    public Furniture(String type,String color,double price,int qty){
        this.type=type;
        this.color=color;
        this.price=price;
        this.qty=qty;
    }
    public Furniture(){}

    public String getType(){
        return type;
    }
    public void setType(String t){
        type=t;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color=c;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price=p;
    }
    public int getQty(){
        return qty;
    }
    public void setQty(int q){
        qty=q;
    }

}
