package lesson8;

import lesson8.hw.Claim;
import lesson8.hw.Hotel;
import lesson8.hw.Ticket;

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
        jane.yearOfBirth=-1989;

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

        House forSell = new House();
        forSell.zip=33401;
        forSell.state = "FL";
        forSell.address = "54 Elm street";
        forSell.city = "Gotham";
        forSell.yearOfBuild=1945;
        forSell.footage=200.23;
        forSell.bathrooms=3;
        forSell.bedrooms=3;
        forSell.sellByOwner=false;
        forSell.price=500000;

        String address = forSell.getAddress();
        System.out.println(address);

        System.out.println(forSell.getHouseInfo());
        System.out.println(forSell.getSellingInfo());







    }
}
