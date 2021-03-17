package Lesson13Homework031621;
import java.lang.reflect.Array;
import java.util.ArrayList;
/*Create 3 ArrayList - String, Integer and some Custom class
Add 4+ elements to each List
        excersize methods add/set/remove/get/foreach and etc */

public class integerArrayList031621<testScoreList> {
    public static void main(String[] args) {

    ArrayList<Integer> testScoreList = new ArrayList<Integer>();
    //assigning elements to the array list:
        testScoreList.add(57);
        testScoreList.add(62);
        testScoreList.add(73);
        testScoreList.add(75);
        testScoreList.add(90);
        System.out.println("testScoreList Below");
        System.out.println(testScoreList);
    //adding 1 additional score to the end, then printing out the testScoreList;
        testScoreList.add(99);
        System.out.println("testScoreList Below after adding 99 to the end");
        System.out.println(testScoreList);
        System.out.println("Number of elements in testScoreList " + testScoreList.size());
        System.out.println("Fourth Element in the testScoreList " + testScoreList.get(3));
        testScoreList.remove(3);
        System.out.println("4th test score(75) Removed below by index");
        System.out.println(testScoreList);
    //Replacing 73 with 74
        testScoreList.add(3, 74);
        //replacing first test score (57) with 100
        testScoreList.set(0,100);
        System.out.println("testScoreList below after replacing first score(57) with 100");
        System.out.println(testScoreList);
    //removing pecan pie from the testScoreList;
        System.out.println("Removing Test score 90 by index");
        testScoreList.remove(4);
        System.out.println(testScoreList);
        System.out.println("displaying the third element(73) in the testScoreList with get: " + testScoreList.get(2));
        System.out.println("printing out the array with forecach");
        for (Integer i: testScoreList) {
        System.out.println(i);

    } //end of for loop

    }//end of main

}//end of string
