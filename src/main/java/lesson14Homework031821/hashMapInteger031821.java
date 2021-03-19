package lesson14Homework031821;

import java.util.HashMap;
import java.util.Map;
/*Create 3 HashMap- <String,String>, <Integer,String> and custom classes <Class1,Class2>
add 4 elements to each hashmap
try methods  put/replace/remove/get/foreach*/
public class hashMapInteger031821 {

        public static void main(String[] args) {
             Map<Integer, Integer> hashmapNumbers = new HashMap();
            hashmapNumbers.put(1,10);
            hashmapNumbers.put(2,20);
            hashmapNumbers.put(3,30);
            hashmapNumbers.put(4,40);
            System.out.println(hashmapNumbers);
            System.out.println("replacing 3rd element  ");
            hashmapNumbers.replace(3, 35);
            System.out.println(hashmapNumbers);
            System.out.println("Removing last element (40)");
            hashmapNumbers.remove(4);
            System.out.println(hashmapNumbers);
            //printingGetresults = hashmapNumbers.get("Rhode Island"); DO WE USE THIS LINE
            //System.out.println("printing Rhode Island Value: " + printingGetresults);
            System.out.println("printing last element: " + hashmapNumbers.get(3));
            //using foreach to print the key/value pairs of the hashmap
            System.out.println("Printing entire hashmap with foreach loop:");
            for (Map.Entry<Integer,Integer> e: hashmapNumbers.entrySet()){
                System.out.println(e.getKey()+"="+e.getValue());

            }
        } //end of main
    } //end of class


