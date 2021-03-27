package tryCatchExample032621;

import java.util.InputMismatchException;
import java.util.Scanner;

public class classTryCatch032621 {

    static void checkAge(int age) {

        try {
            if (age < 18) {
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
            } else {
                System.out.println("Access granted - You are old enough!");
            }
        } catch (IllegalArgumentException err) {
            System.out.println("not a number entered");
        } //end of catch
    }

    public static void main(String[] args) {


        checkAge(15); // Set age to 15 (which is below 18...)






    } //end of main
} //end of class










