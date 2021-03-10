package lesson8_UA;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Smith";
        anna.yearOfBirth = 1999;

        Person david = new Person();
        david.name = "David";
        david.lastName = "Dole";
        david.yearOfBirth = 1995;

        Person jane = new Person();
        jane.name = "Jane";
        jane.lastName = "Wilson";
        jane.yearOfBirth = 1989;

        System.out.println(anna.lastName);
        System.out.println(david.yearOfBirth);
        System.out.println(jane.name);

        Vehicle myVehicle = new Vehicle();
        myVehicle.color = "Orange";
        myVehicle.make = "Toyota";
        myVehicle.model = "Prius";
        myVehicle.year = 2012;

        Vehicle myFriendVehicle = new Vehicle();
        myFriendVehicle.make = "Honda";
        myFriendVehicle.model = "Odyssey";
        myFriendVehicle.color = "Silver ";



        myVehicle.drive(50);
        myVehicle.beep();

        myFriendVehicle.drive(40);
        myFriendVehicle.beep();
    }
}
