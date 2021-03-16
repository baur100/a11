/*
Create 2 Enums, Create 2 classes. First using Enum, Second Array of Enums as a Field*/

package Lesson101112HomeworkCorrected031621.homework11EnumsAndClassesCorrected031621;

import Lession101112Homework031421.homework11EnumsAndClasses031421.dessertClass031421;
import Lession101112Homework031421.homework11EnumsAndClasses031421.enumDessert031421;

public class homework11enumsClassses031621 {

    public static void main(String[] args) {
        System.out.println("Hi There");
        String snackVariable;

        System.out.println("Desserts are listed below:");

        dessertClass031621 tonightsDessert =  new dessertClass031621(enumDessert031421.chocolatecake, enumDessertSize031621.extralarge, 4);
        System.out.println("Tonight's Dessert: " + tonightsDessert);

        dessertClass031621 tomorrowsDessert = new dessertClass031621(enumDessert031421.peachcobbler, enumDessertSize031621.extralarge, 5);
        System.out.println("Tomorrow's Dessert: " + tomorrowsDessert);
        //dessertClass031421 fridaysDessert = new dessertClass031421(enumDessert031421.peachcobbler, "Small" ,3  );
        //System.out.println(fridaysDessert);

    } //end of main
} //end of class
