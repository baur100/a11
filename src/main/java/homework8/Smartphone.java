package homework8;

public class Smartphone {
    public String model;
    public double screenSize;
    public int batterySize;
    public boolean hasCardSlot;

    public void phoneInfo(){
        System.out.println(model + " has screen size of " + screenSize + "in, packed with " + batterySize + "mAh battery.");
    }

    public void memoryExtension(){
        System.out.println(model + " is " + hasCardSlot + " on memory card slot.");
    }
}
