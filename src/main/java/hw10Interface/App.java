package hw10Interface;

public class App {
    public static void main(String[] args) {
        BlackCar bC = new BlackCar();
        bC.beep();
        bC.openWindows();

        BlackCar secondCar = new BlackCar();
        secondCar.beep();
        secondCar.openWindows();

        Main carOne = new WhiteCar();
        carOne.beep();
        carOne.openWindows();

        WhiteCar wCar = new WhiteCar();
        wCar.beep();
        wCar.openWindows();
    }




}
