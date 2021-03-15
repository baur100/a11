package lesson12;

public class Bike implements Vehicle{
    int gear;
    int speed;

    public Bike(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
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
        return "Bike{" +
                "gear=" + gear +
                ", speed=" + speed +
                '}';
    }
}
