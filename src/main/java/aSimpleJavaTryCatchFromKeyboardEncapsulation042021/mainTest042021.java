package aSimpleJavaTryCatchFromKeyboardEncapsulation042021;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mainTest042021 {
    public static void main(String[] args) {
        Integer firstNumberFromKeyboard = 0;
        Integer secondNumberFromKeyboard = 0;
        String firstNum = " ";
        String secondNum = " ";
        boolean ErrorFoundflag = false;

        System.out.println("Hi There");
        System.out.println("This is a test");

        //initialzing readers
        BufferedReader brFirstNumber = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brSecondNumber = new BufferedReader(new InputStreamReader(System.in));

         try {
            System.out.println("Enter first Number");
            firstNum = brFirstNumber.readLine();
            firstNumberFromKeyboard = Integer.parseInt(firstNum);
           } catch (Exception e) {
            System.out.println("Error reading first number from Input device. Not an Integer");
             ErrorFoundflag = true;
             mainTest042021 circleArea  = new mainTest042021();
           }  //end of try catch

        //If the first number was bad, don't try to get a second number


            try {
                System.out.println("Enter second Number");
                secondNum = brSecondNumber.readLine();
                secondNumberFromKeyboard = Integer.parseInt(secondNum);
            } catch (Exception e) {
                System.out.println("Error reading second number from Input device. Not an Integer");
                mainTest042021 circleArea1 = new mainTest042021();
                ErrorFoundflag = true;
            } //end of catch */

            if (ErrorFoundflag == false) {

                //creating new instance of the object used to add the two numbers, printing out the result.
                simpleEncapsulationExample042021 FirstTest = new simpleEncapsulationExample042021(firstNumberFromKeyboard, secondNumberFromKeyboard);
                FirstTest.SumTheNumbers(firstNumberFromKeyboard, secondNumberFromKeyboard);
                System.out.println(FirstTest);
                //examples of calling a static methods below..notice we can call it directly from the class, not the instance.
                simpleEncapsulationExample042021.SayHiThere();
                simpleEncapsulationExample042021.displayFirstNumberTimesTwo(firstNumberFromKeyboard);


            }
            else { //non integer entered for either the first or second number...go around
                 System.out.println("text entered for either of the two selections.");
            }


        } //end of main
        } //end of class






