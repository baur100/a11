package hw8_UA;

public class App {
    public static void main(String[] args) {

        // Class 1 - 1st Instance:
        Dinosaur t_bone = new Dinosaur();
        t_bone.name = "Tyrannosaurus";
        t_bone.diet = "carnivores";
        t_bone.color = "reddish-brown";
        t_bone.height = 20;
        t_bone.width = 40;

        t_bone.getDinoInfo();

        // Class 1 - 2nd Instance:

        Dinosaur blue = new Dinosaur();
        blue.name = "Velociraptor";
        blue.diet = "carnivores";
        blue.color = "green";
        blue.height = 7;
        blue.width = 6;

        blue.getDinoInfo();

        // Class 2 - 1st Instance:

        Athlete bron = new Athlete();
        bron.firstName = "Lebron";
        bron.lastName = "James";
        bron.sport = "BasketBall";
        bron.team = "Los Angeles Lakers";
        bron.jerseyNumber = 23;
        bron.position = "Power Forward";

        bron.getPlayerInfo();

        // Class 2 - 2nd Instance:

        Athlete kd = new Athlete();
        kd.firstName = "Kevin";
        kd.lastName = "Durant";
        kd.sport = "BasketBall";
        kd.team = "New Jersey Nets";
        kd.jerseyNumber = 7;
        kd.position = "Small Forward";

        kd.getPlayerInfo();

        // Class 3 - 1st Instance:


        Cellphones mobile1 = new Cellphones();
        mobile1.brand = "Apple iPhone";
        mobile1.service = "Verizon";
        mobile1.color = "Space Grey";
        mobile1.price = 1000;

        mobile1.cellPhoneSpecs();

        // Class 3 - 2nd Instance:

        Cellphones mobile2 = new Cellphones();
        mobile2.brand = "Android S8";
        mobile2.service = "T-mobile";
        mobile2.color = "black";
        mobile2.price = 650;

        mobile2.cellPhoneSpecs();

        // Class 4 - 1st Instance:

        Footwear option1 = new Footwear();
        option1.shoes = "Shoes";
        option1.brand = "Nike";
        option1.color = "Blue";
        option1.size = 11;
        option1.price = 100;

        option1.getFootwearDetails();

        // Class 4 - 2nd Instance:

        Footwear option2 = new Footwear();
        option2.shoes = "Sandals";
        option2.brand = "Addidas";
        option2.color = "Black";
        option2.size = 12;
        option2.price = 60;

        option2.getFootwearDetails();





    }
}
