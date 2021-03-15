package hw9_UA;

public class App {
    public static void main(String[] args) {

        System.out.println("Cars instance 1:");

        Cars honda = new Cars();

        honda.setMake("Ferrari");
        honda.setModel("575m maranello");
        honda.setColor("Silver");
        honda.setYear(2000);

        honda.getCars();

        System.out.println("Cars instance 2:");

        Cars mercedes = new Cars("Mercedes", "S550", "Black", 2021);

        mercedes.getCars();

        System.out.println("Person instance 1:");


        Person mike = new Person();

        mike.setFirstName("Mike");
        mike.setLastName("Bryant");
        mike.setYearOfBirth(1978);

        mike.getPerson();

        System.out.println("Person instance 2:");

        Person john = new Person ("John", "Roberts", 1984);

        john.getPerson();

        System.out.println("Desserts instance 1:");

        Desserts cake = new Desserts();

        cake.setName("Cake");
        cake.setColor("white");
        cake.setShape("circle");

        cake.getDesserts();

        System.out.println("Desserts instance 2:");

        Desserts iceCreamCake = new Desserts("Ice Cream Cake", "rectangle", "blue");
        iceCreamCake.getDesserts();


        System.out.println("Vegetables instance 1:");

        Vegetables potato = new Vegetables();

        potato.setName("Potato");
        potato.setColor("brown");
        potato.setShape("oval");

        potato.getVegetableDetails();


        System.out.println("Vegetables instance 2:");

        Vegetables carrot = new Vegetables("Carrot", "conical", "orange");
        carrot.getVegetableDetails();


    }
}
