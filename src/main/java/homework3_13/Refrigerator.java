package homework3_13;

public class Refrigerator extends Appliance{
    private int numberOfDoors;

    public Refrigerator(String brand,String model,String color,double capacity,int numberOfDoors,double price){
        super(brand,model,color,capacity,price);
        this.numberOfDoors=numberOfDoors;
    }

    public int getNumberOfDoors(){
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors){
        this.numberOfDoors=numberOfDoors;
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +" Cu.Ft"+'\'' +
                ", number Of Doors="+numberOfDoors+'\''+
                ", price=" + price +
                '}';
    }
}
