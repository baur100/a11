package ab123lesson8;

public class App8 {
    public static void main(String[] args) {

        Person8 mike = new Person8();
        mike.name = "Mike";
        mike.lastName= "Kenealy";
        mike.yearOfBirth= 1983;


        Person8 david = new Person8();
        david.name = "david";
        david.lastName= "Dole";
        david.yearOfBirth=1995;
        System.out.println(mike.lastName);

        Vehicle myVehicle = new Vehicle();
        myVehicle.color="Orange";
        myVehicle.make="Toyota";
        myVehicle.model="Prius";
        myVehicle.year=2012;

        Vehicle myFriendVehicle = new Vehicle();
        myFriendVehicle.make = "Honda";
        myFriendVehicle.model = "Odyssey";
        myFriendVehicle.color = "Blue";

        myVehicle.drive( 50);
        myVehicle.beep();

        myFriendVehicle.drive(50);
        myFriendVehicle.beep();
    }
}
