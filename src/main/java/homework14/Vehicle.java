package homework14;

public class Vehicle {
    private String model;

    public Vehicle(String model){
        this.model = model;
    }

    public Vehicle(){}

    public String getModel(String model){
        return model;
    }

    public void setModel(){
        this.model = model;
    }

    @Override
    public String toString() {
        return "Vehicle model= " + model;
    }
}
