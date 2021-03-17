package Lesson13Homework031621;
 import java.lang.reflect.Array;
 import java.util.ArrayList;

/*Create 3 ArrayList - String, Integer and some Custom class
Add 4+ elements to each List
        excersize methods add/set/remove/get/foreach and etc */

public class stringArrayList031621 {
    public static void main(String[] args) {
        //creating Array List:
        ArrayList<String> pieList = new ArrayList<String>();
        //assigning elements to the array list:
        pieList.add("ApplePie");
        pieList.add("PumpkinPie");
        pieList.add("ChocolateCreamPie");
        pieList.add("BlueberryPie");
        pieList.add("KeyLimePie");
        System.out.println("PieList Below");
        System.out.println(pieList);
        //adding 1 additional pie, then printing out the pieList;
        pieList.add("CoconutCreamPie");
        System.out.println("PieList Below after adding Coconut Cream Pie to the end");
        System.out.println(pieList);
        System.out.println("Number of elements in pieList " + pieList.size());
        //printing only the fifth element in the pieList
        System.out.println("Fourth Element in the pielist " + pieList.get(3));
        //Remove Blueberry Pie, print the pieList.
        pieList.remove(3);
        System.out.println("BlueBerry Pie Removed below by index");
        System.out.println(pieList);
        //Adding Pecan Pie to the pielist: 4th element.
        pieList.add(3, "PecanPie");
        pieList.set(0,"StrawberryPie");
        System.out.println("PieList Below after replacing Apple with Strawberry Pie (first element) ;Pecan Pie added as fourth element ");
        System.out.println(pieList);
        //removing pecan pie from the pieList;
        System.out.println("Removing Pecan Pie from the Pielist by name");
        pieList.remove("PecanPie");
        System.out.println(pieList);
        System.out.println("displaying the third element in the pielist with get: " + pieList.get(2));
        System.out.println("printing out the array with forecach");
        for (String s : pieList) {
            System.out.println(s);

        } //end of for loop
    }//end of main

}//end of class
