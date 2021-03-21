package tickets;

public class Tickets {
    private int age;
    private double fare;

    public Tickets(int age, double fare) {
        this.age = age;
        this.fare = fare;
    }
    public double getPrice(){
        if (this.age<=2){
            return 0;
        }
        if (this.age<=12){
            return fare*0.5;
        }
        if (this.age>65){
            return fare*0.8;
        }
        return this.fare;
    }
}
