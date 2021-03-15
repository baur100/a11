package hw9;

public class App {
    public static void main(String[] args) {
        String computerVar, schoolVar, vehicleVar, personVar;

        Person mark = new Person();
        mark.setName("Mark");
        mark.setLastName("Hanson");
        mark.setYearOfBirth(1985);

        Person aaron = new Person("Aaron", "Lewis", 1975);

        personVar = mark.returnPerson(mark.getName(), mark.getLastName(), mark.getYearOfBirth() );
        System.out.println(personVar);


        personVar = aaron.returnPerson(aaron.getName(), aaron.getLastName(), aaron.getYearOfBirth());
        System.out.println(personVar);

        Vehicle myVehicle = new Vehicle();
        myVehicle.setMake("Honda");
        myVehicle.setModel("Civic");
        myVehicle.setYear(2020);
        myVehicle.setColor("Black");

        Vehicle friendVehicle = new Vehicle("Toyota", "Prius", 2015, "Red");

        vehicleVar = myVehicle.returnVehicle(myVehicle.getMake(), myVehicle.getModel(), myVehicle.getYear(), myVehicle.getColor());
        System.out.println(vehicleVar);

        vehicleVar = friendVehicle.returnVehicle(friendVehicle.getMake(), friendVehicle.getModel(), myVehicle.getYear(), friendVehicle.getColor());
        System.out.println(vehicleVar);

        Computer myComputer = new Computer();
        myComputer.setCaseType("NZXT");
        myComputer.setMotherboard("MSI");
        myComputer.setRamSpeed(3600);

        Computer notComputer = new Computer("BeQuiet", "Gigabyte", 4000);

        computerVar = myComputer.returnComputer(myComputer.getCaseType(), myComputer.getMotherboard(), myComputer.getRamSpeed());
        System.out.println(computerVar);

        computerVar = notComputer.returnComputer(notComputer.getCaseType(), notComputer.getMotherboard(), notComputer.getRamSpeed());
        System.out.println(computerVar);

        School mySchool = new School();
        mySchool.setNameOfSchool("Irmo High School");
        mySchool.setType("Public");
        mySchool.setLocation("Columbia, SC");

        School notSchool = new School("Berea College", "Private", "Berea,KY");

        schoolVar =  mySchool.returnSchool(mySchool.getNameOfSchool(), mySchool.getType(), mySchool.getLocation());
        System.out.println(schoolVar);

        schoolVar = notSchool.returnSchool(notSchool.getNameOfSchool(), notSchool.getType(), notSchool.getLocation());
        System.out.println(schoolVar);



    }


}
