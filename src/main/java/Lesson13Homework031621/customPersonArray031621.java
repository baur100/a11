package Lesson13Homework031621;
/*Create 3 ArrayList - String, Integer and some Custom class
Add 4+ elements to each List
        excersize methods add/set/remove/get/foreach and etc */

import java.util.ArrayList;
import java.util.List;

public class customPersonArray031621 {
    public static void main(String[] args) {
        List<personClass> workers = new ArrayList<>();
        workers.add(new personClass("Peter"));
        workers.add(new personClass("Alice"));
        workers.add(new personClass("Charles"));
        workers.add(new personClass("Alex"));

       //System.out.println(workers.get(0).getName() );

        System.out.println("Printing all " + workers.size()  + " workers with println:");
        //printing out all workers
        System.out.println(workers);

        System.out.println("Printing the fourth worker from the array: " + workers.get(3));
        //removing 4th worker from the array
        workers.remove(3);

        System.out.println("fourth worker removed from the array");
        System.out.println(workers);

        System.out.println( "adding new worker to the beginning of the array");

        workers.add(0, new personClass("Henry"));
        System.out.println(workers);

        //using set: set the 4th element in the array
        workers.set(3, new personClass( "William"));
        System.out.println(workers);

        System.out.println("fourth worker in the array " + workers.get(3));

        System.out.println("Printing workers with for/next loop");
        //using fornext to print out all workers
        for (personClass p :workers) {
            System.out.println(p);

        } //end of for loop
    } //end of main


} //end of class

