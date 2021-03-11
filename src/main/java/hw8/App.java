package hw8;

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

        Person jackie = new Person();
        jackie.name = "Jacqueline";
        jackie.lastName = "Taylor";
        jackie.yearOfBirth = 2003;

        Pet Macintosh = new Pet();
        Macintosh.name = "Macintosh";
        Macintosh.type = "Dog";
        Macintosh.breed = "Poodle";
        Macintosh.yearOfBirth = 2018;

        Macintosh.ride("loves")

        //Pet Bimmy = new Pet();
        //Bimmy.name = "Bimmy";
        //Bimmy.type = "Rabbit";
        //Bimmy.breed = "Dutch";
        //Bimmy.yearOfBirth = 2012;


        Vehicle myVehicle = new Vehicle();
        myVehicle.color = "Orange";
        myVehicle.make = "Toyota";
        myVehicle.model = "Prius";
        myVehicle.year = 2012;

        myVehicle.drive(50);

    }
}