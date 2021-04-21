package aSimpleJavaTryCatchFromKeyboardEncapsulation042021;

public class simpleEncapsulationExample042021 {
    private Integer firstNumber;
    private Integer secondNumber;
    private Integer SumTwoNumbers;


    public simpleEncapsulationExample042021(Integer firstNumber, Integer secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;

    }

    public static void SayHiThere() {
        System.out.println ("Hi there from the class");
    }

    public static void displayFirstNumberTimesTwo(Integer firstNumber) {
        Integer twiceMultiplied = firstNumber*2;

        System.out.println ("First Number times Two " + twiceMultiplied);
    }

    //private Integer SumTheNumbers (Integer firstNumber, Integer secondNumber) {
    public Integer SumTheNumbers (Integer firstNumber, Integer secondNumber) {

        //summing two numbers
        SumTwoNumbers = firstNumber + secondNumber;
        //System.out.println("Sum Two Numbers is " + SumTwoNumbers);

        return SumTwoNumbers;
    }


    @Override
    public String toString() {
        return "simpleEncapsulationExample042021{" + "firstNumber " + firstNumber + " secondNumber " + secondNumber + " "  + " sumtwoNumbers " + SumTwoNumbers +'}';
    }

} //end of class
