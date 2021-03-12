package Lesson9Homework;
/*1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
each class has at least 2 constructors (default and full)
create printClass()/ printInfo() method to print out all fields
fields are private
each field has getter and setter
2. In the App class create main() and create 2 instanses of each class;
one instance created used default constructor - fill up fields using setter
second object created using full constructor
print object info using print-out method*/


public class Lesson9GetAndSet031021 {
    public static void main(String[] args) {
        System.out.println("This is a test");
        String hatVariables, stoveVariables, boatVariables, shoeVariables;
        //full constructor example below for classhat
        classHat cowboyHat = new classHat("Western","Brown", 12 );

        //default constructor example for classhat below
        classHat topHat = new classHat();
        topHat.sethatStyle("Classical");
        topHat.sethatColor("Black");
        topHat.sethatSize(10);

        //printing values for tophat and cowboyhat below
        System.out.println("topHat variables in Main below");
        hatVariables = topHat.returnHatparameters(topHat.gethatStyle(), topHat.gethatColor(), topHat.gethatSize());
        System.out.println(hatVariables);
        System.out.println("cowboyhat variables in Main below");
        hatVariables = cowboyHat.returnHatparameters(cowboyHat.gethatStyle(),cowboyHat.gethatColor(), cowboyHat.gethatSize());
        System.out.println(hatVariables);

        //default constructor example for classStove below
        classStove kitchenStove = new classStove();
        kitchenStove.setStoveType("IndoorStove");
        kitchenStove.setStoveManufacturer("Maytag");
        kitchenStove.setNumberOfBurners(4);
        kitchenStove.setOnOrOff(false);
        stoveVariables = kitchenStove.ReturnStoveparameters(kitchenStove.getStoveType(), kitchenStove.getStoveManufacturer(), kitchenStove.getNumberOfBurners(), kitchenStove.getonOrOff());
        System.out.println(stoveVariables);

        //full constructor example below for classStove
        classStove campingStove = new classStove("outdoors", "Coleman", 1,true);
        System.out.println("Stove variables in Main below");
        stoveVariables = campingStove.ReturnStoveparameters(campingStove.getStoveType(), campingStove.getStoveManufacturer(), campingStove.getNumberOfBurners(), campingStove.getonOrOff());
        System.out.println(stoveVariables);

        //default constructor example for classBoat below
        classBoat motorBoat = new classBoat();
        motorBoat.setboatMake("Fountain");
        motorBoat.setboatModel("Lightning");
        motorBoat.setKnots(45);
        boatVariables = motorBoat.returnBoatParameters(motorBoat.getboatMake(), motorBoat.getBoatModel(), motorBoat.getknots());
        System.out.println(boatVariables);
        motorBoat.sail(45);

        //full constructor example for classBoat below
        classBoat sailBoat = new classBoat("Erricson", "Floatilla", 5);
        boatVariables = sailBoat.returnBoatParameters(sailBoat.getboatMake(), sailBoat.getBoatModel(), sailBoat.getknots());
        System.out.println(boatVariables);
        sailBoat.sail(5);

        //default constructor for classShoe below:
        classShoe tennisShoe = new classShoe();
        tennisShoe.setShoeSize(10.5);
        tennisShoe.setShoeColor("white");
        tennisShoe.setShoeType("Athletic");
        tennisShoe.setShoeManufacturer("Addidas");
        shoeVariables= tennisShoe.returnShoeparameters(tennisShoe.getShoeSize(), tennisShoe.getShoeColor(), tennisShoe.getShoeType(), tennisShoe.getShoeManufacturer());
        System.out.println(shoeVariables);

        //full constructor for classShoe below:
        classShoe hikingShoe = new classShoe(11.0, "Adventure", "Brown", "Vasque");
        shoeVariables= tennisShoe.returnShoeparameters(hikingShoe.getShoeSize(), hikingShoe.getShoeColor(), hikingShoe.getShoeType(), hikingShoe.getShoeManufacturer());
        System.out.println(shoeVariables);

         } //end of main

       } //end of class




