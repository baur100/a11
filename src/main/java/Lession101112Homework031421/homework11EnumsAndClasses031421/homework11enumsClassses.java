/*
Create 2 Enums, Create 2 classes. First using Enum, Second Array of Enums as a Field*/

package Lession101112Homework031421.homework11EnumsAndClasses031421;

public class homework11enumsClassses {
    enum enumSnacks031421 {
        potatochips,
        tortillachips,
        oreos,
        cheetos,
        cookies
    }
    public static void main(String[] args) {
        System.out.println("Hi There");
        String snackVariable;

        //part 1: using enum.
        snackVariable = enumSnacks031421.oreos.toString();
        System.out.println("Today's snack is " + snackVariable);


        System.out.println("Desserts are listed below:");
        //part 2: using array of enums as a field
       dessertClass031421 tonightsDessert = new dessertClass031421(enumDessert031421.chocolatecake, "Large" , 4 );
       System.out.println(tonightsDessert);

        dessertClass031421 fridaysDessert = new dessertClass031421(enumDessert031421.peachcobbler, "Small" ,3  );
        System.out.println(fridaysDessert);

    } //end of main
} //end of class
