package lesson14Homework031821;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
add 4 elements to each hashmap
try methods  put/replace/remove/get/foreach*/

public class hashMapCustomClass031821 {
     public static void main(String[] args) {
     flightClass031821 key;
     String key1;

       HashMap<flightClass031821,String> flightInfo = new HashMap<flightClass031821,String>();

       flightInfo.put(new flightClass031821(2453, "Boeing 787"), "Blue");

       flightInfo.put(new flightClass031821(2453, "Boeing 757"), "Green");

       flightInfo.put(new flightClass031821(5673, "Airbus 330"), "Red");

       flightInfo.put(new flightClass031821(4572, "Lockheed Electra"), "Orange");


       //unable to remove an existing object, trying to use code below..its not working:
       //flightClass031821 key = flightClass031821(4572, "Lockheed Electra");

       //flightInfo.remove(key);


       System.out.println("flight info: " + flightInfo);








     }//end of main

} //end of class



