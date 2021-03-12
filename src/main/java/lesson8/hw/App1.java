package lesson8.hw;

import lesson8.hw.Claim;
import lesson8.hw.Hotel;
import lesson8.hw.Ticket;

public class App1 {
    public static void main(String[] args) {
        Claim jeweler = new Claim();
        jeweler.id=134545;
        jeweler.insuredName="David";
        jeweler.dateOfLoss=03;

        /*System.out.println(jeweler.id);*/

        Claim homeowner = new Claim();
        homeowner.id=1234567;
        homeowner.insuredName="Mary";
        homeowner.dateOfLoss=12022018;

        /* System.out.println(homeowner.dateOfLoss);*/

        Ticket theater = new Ticket();
        theater.name="Susan";
        theater.lastName="Schiller";
        theater.row=24;
        theater.seatNumber=7;

        /*System.out.println(theater.lastName);
        System.out.println(theater.name);
        System.out.println(theater.row);
        System.out.println(theater.seatNumber);*/

        Hotel building = new Hotel();
        building.city= "Chicago";
        building.state= "IL";
        building.buildingNumber=777;
        building.street="Palm Tree Drive";
        building.name= "Bravo";

        System.out.println(building.city);
        System.out.println(building.state);
        System.out.println(building.buildingNumber);
        System.out.println(building.street);
        System.out.println(building.name);


    }
}
