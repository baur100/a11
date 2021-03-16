package lesson12;

public class LaserPrinter implements AmericanElectricalPlug{
    @Override
    public void americanPlug() {
        System.out.println("Hey, supporting American plug");
    }
}
