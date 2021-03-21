package homework3_13;

public class Dishwasher extends Appliance{
    private String type;
    private int noise;
    private int optionCycles;

    public Dishwasher(String type,String brand,String model,String color,double capacity,int noise,int optionCycles,double price){
        super(brand,model,color,capacity,price);
        this.type=type;
        this.noise=noise;
        this.optionCycles=optionCycles;
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type=type;
    }
    public int getNoise(){
        return noise;
    }
    public void setNoise(){
        this.noise=noise;
    }
    public int getOptionCycles(){
        return optionCycles;
    }
    public void setOptionCycles(){
        this.optionCycles=optionCycles;
    }
    public String toString(){
        return "Dishwasher:"+"Type: "+type+", Brand: "+brand+", Model: "+model+", Color:"+color+", Capacity:"+capacity+" Liters"+", Noise:"+noise+"dB"+", Option cycles:"+optionCycles+", Price:"+price+".";
    }
}
