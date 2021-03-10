package lesson8;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name=  "Anna";
        anna.lastName = "Smith";
        anna.yearOfBirth = 1999;

        Person david = new Person();
        david.name = "David";
        david.lastName="Dole";
        david.yearOfBirth=1995;

        Person jane = new Person();
        jane.name="Jane";
        jane.lastName="Wilson";
        jane.yearOfBirth=1989;

//        System.out.println(anna.lastName);

        Vehicle myVehicle = new Vehicle();
        myVehicle.color="Orange";
        myVehicle.make = "Toyota";
        myVehicle.model = "Prius";
        myVehicle.year=2012;

        Vehicle myFriendVehicle = new Vehicle();
        myFriendVehicle.make = "Honda";
        myFriendVehicle.model="Odyssey";
        myFriendVehicle.color="Pink";

        myVehicle.drive(50);
        myVehicle.beep();

        myFriendVehicle.drive(50);
        myFriendVehicle.beep();

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
