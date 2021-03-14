package hw10SuperClass;

import java.util.PrimitiveIterator;

public class BlackCar implements Main{
    private String make;
    private String model;
    private int year;
    @Override
    public void beep() {
        System.out.println("Black Car is beep beep");
    }

    @Override
    public void openWindows() {
        System.out.println("Black Car is open windows");
    }
}
