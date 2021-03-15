package hw10Interface;

public class BlackCar implements InterfaceForCar {
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
