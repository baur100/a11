package lesson12_UA;

public class LaserPrinter implements AmericanElectricalPlug{
    @Override
    public void americanPlug() {
        System.out.println("Hey, supporting American plug");
    }
}
