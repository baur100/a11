package lesson12;

public class Car implements Vehicle{
    int gear;
    int speed;
    int seats;
    int windows;

    public Car(int gear, int speed, int seats, int windows) {
        this.gear = gear;
        this.speed = speed;
        this.seats = seats;
        this.windows = windows;
    }

    @Override
    public void change_gear(int newGear) {
        this.gear = newGear;
    }

    @Override
    public void accelerate(int speedValue) {
        this.speed += speedValue;
    }

    @Override
    public void slow_down(int speedValue) {
        this.speed -= speedValue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "gear=" + gear +
                ", speed=" + speed +
                ", seats=" + seats +
                ", windows=" + windows +
                '}';
    }
}
