package hw10Interface;

public class WhiteCar implements Main {
    private String make;
    private String model;
    private int year;
    @Override
    public void beep() {
        System.out.println("White Car is beep beep");
    }

    @Override
    public void openWindows() {
        System.out.println("White Car is open windows");
    }
}
