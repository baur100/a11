package lesson12;

public class AppHomework12 {
    public static void main(String[] args) {

       Vehicle v = new Bike(2, 15);
       Bike bike = new Bike(3, 25);


        Vehicle c = new Car(4, 55, 4, 4);
        Car car = new Car(5, 75, 2,2);

        v.accelerate(5);
        c.slow_down(10);
        v.change_gear(3);
        c.change_gear(2);
        bike.slow_down(10);
        car.accelerate(5);

        Vehicle[] vehicles = {v,c,bike,car};

        for(Vehicle item:vehicles)
           {
               System.out.println(item.toString()) ;
               System.out.println("***********************************");
           }

      }

}
