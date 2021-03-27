package tryCatchExample032621;

import java.util.Scanner;


public class classTryCatch032721A {

    static void checkAge(String age) {
        System.out.println("age is " + age);
        int age2 = 0;

        try {
            age2 = Integer.parseInt(age);
        } catch (Exception ex) {
            System.out.println("Error: Could not parse age to number, exiting");
            return;
        }

        if (age2 < 18) {
            System.out.println("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        //System.out.println("Hi There");


        checkAge("15");
        checkAge("This");
        checkAge("18");
      // checkAge(textEntered);

    }  //end of main
}  //end of class
