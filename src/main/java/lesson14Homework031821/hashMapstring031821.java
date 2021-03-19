package lesson14Homework031821;

/*Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
add 4 elements to each hashmap
try methods  put/replace/remove/get/foreach*/

import java.util.HashMap;
import java.util.Map;

public class hashMapstring031821 {
    public static void main(String[] args) {

        Map<String, String> statesAndCapitols = new HashMap();
        statesAndCapitols.put("California", "Sacramento");
        statesAndCapitols.put("Rhode Island", "Providence");
        statesAndCapitols.put("Wyoming", "Cheyenne" );
        statesAndCapitols.put("Montana", "Helena");
        System.out.println(statesAndCapitols);
        System.out.println("replacing Cheyenne, then printing out the new key/value pair");
        statesAndCapitols.replace("Wyoming", "Laramie" );
        System.out.println(statesAndCapitols);
        System.out.println("Removing Montana, then printing out the hashmap");
        statesAndCapitols.remove("Montana");
        System.out.println(statesAndCapitols);
        System.out.println("printing Rhode Island Value: " + statesAndCapitols.get("Rhode Island"));
        //using foreach to print the key/value pairs of the hashmap
        System.out.println("Printing entire hashmap with foreach loop:");
        for (Map.Entry<String,String> e: statesAndCapitols.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());

        }
    } //end of main
} //end of class
