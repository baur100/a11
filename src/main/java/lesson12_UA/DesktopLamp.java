package lesson12_UA;

public class DesktopLamp implements AmericanElectricalPlug, E27Bulb{
    private String brand;
    private String model;
    private int price;

    @Override
    public void americanPlug() {
        System.out.println("I implement American Electrical plug interface");
    }

    @Override
    public void e27Bulb() {
        System.out.println("My Desktop light using bulb e27");
    }
}
