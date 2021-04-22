package aSimpleExampleOverloading042021;

public class aSimpleClassOverloadingExampleMain042221 {


    public static void main(String[] args) {
        double doubleResult;
        Integer integerResult;
        System.out.println("This is a test");

     //calling method with 2 doubles
     doubleResult = aSimpleClassCombineMethod042221.combineMethod(2.22, 4.44);
     System.out.println("Double Result is: " + doubleResult);

     //calling method with 2 integers
     integerResult = aSimpleClassCombineMethod042221.combineMethod(10, 10);
     System.out.println("Integer Result is " + integerResult);

     //calling method with 2 ints and a characters, method will print out the character from the method directly.
      doubleResult = aSimpleClassCombineMethod042221.combineMethod(4, 5, 'G');
        System.out.println("Double Result (with character) is: " + doubleResult);
    }  //end of main
} //end of class
