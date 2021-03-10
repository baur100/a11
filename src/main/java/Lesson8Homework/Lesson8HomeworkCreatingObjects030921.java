package Lesson8Homework;
/*1. Create 4 classes with fields and methods
2. In the App class create main() and create 2 instances of each class, fill all fields
invoke methods*/

public class Lesson8HomeworkCreatingObjects030921 {
    public static void main(String[] args) {


        //creating instances of the hat object
        classHat cowboyHat = new classHat();
        cowboyHat.hatColor = "Brown";
        cowboyHat.hatSize = 12;
        cowboyHat.hatStyle = "Western";

        classHat topHat = new classHat();
        topHat.hatColor = "Black";
        topHat.hatSize = 11;
        topHat.hatStyle = "Classical";

        //creating instances of the shoe object
        classShoe tennisShoe = new classShoe();
        tennisShoe.shoeColor = "white";
        tennisShoe.shoeSize = 10.5;
        tennisShoe.shoeType = "Athletic";
        tennisShoe.shoeManufacturer = "New Balance";

        classShoe hikingShoe = new classShoe();
        hikingShoe.shoeColor = "brown";
        hikingShoe.shoeSize = 11;
        hikingShoe.shoeType = "Adventure";
        hikingShoe.shoeManufacturer = "Vasque";

        //creating instances of the boat object
        classBoat sailboat = new classBoat();
        sailboat.make = "Erricson";
        sailboat.model = "Floatilla";


        classBoat speedboat = new classBoat();
        speedboat.make = "Fountain";
        speedboat.model = "Lightning";

        System.out.println("This is homework for lesson 8");
        System.out.println("    ");
        //calling boat object below
        sailboat.sail(5);
        speedboat.sail(45);
        System.out.println("   ");

        classStove campingStove = new classStove();
        campingStove.numberOfBurners = 1;
        campingStove.stoveType = "Outdoors";
        campingStove.stoveManufacturer = "Coleman";
        campingStove.onOrOff = false;

        classStove kitchenStove = new classStove();
        kitchenStove.numberOfBurners = 4;
        kitchenStove.stoveType = "Indoors";
        kitchenStove.stoveManufacturer = "Maytag";
        kitchenStove.onOrOff = true;

        //printing out object info below:

        String campingStoveInfo = campingStove.getStoveInfo();
        System.out.println(campingStoveInfo);
        System.out.println(campingStove.getStoveState());

        String kitchenStoveInfo = kitchenStove.getStoveInfo();
        System.out.println(kitchenStoveInfo);
        System.out.println(kitchenStove.getStoveState());
        System.out.println("    ");


        System.out.println("Cowboy hat info: " + " " + cowboyHat.hatColor + " " + cowboyHat.hatSize + " " + cowboyHat.hatStyle );
        System.out.println("Tophat info: " + " " + topHat.hatColor + " " + topHat.hatSize + " " + topHat.hatStyle);
        System.out.println("                     " );
        System.out.println("Tennis Shoe info: " + " " + tennisShoe.shoeType + " " + tennisShoe.shoeColor + " " + tennisShoe.shoeManufacturer + " "+ tennisShoe.shoeSize);
        System.out.println("Hiking Shoe info: " + " " + hikingShoe.shoeType + " " + hikingShoe.shoeColor + " " + hikingShoe.shoeManufacturer + " "+ hikingShoe.shoeSize);
        System.out.println("                     " );







    }
}
