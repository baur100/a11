package hw3_UA;

public class App {
    public static void main(String[] args) {

        // #1

        int[] number = {23, 7, 24, 6, 11, 2, 13};
        // System.out.println(number.length);
        // System.out.println(number[number.length-3]);
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);
        System.out.println(number[3]);
        System.out.println(number[4]);
        System.out.println(number[5]);
        System.out.println(number[6]);

        // #2

        String[] emptyArray = new String[4];
        emptyArray[0] = "Michael Jordan";
        emptyArray[1] = "Kobe Bryant";
        emptyArray[2] = "Lebron James";
        emptyArray[3] = "Kevin Durant";

        System.out.println(emptyArray[0]);
        System.out.println(emptyArray[1]);
        System.out.println(emptyArray[2]);
        System.out.println(emptyArray[3]);

        // #3

        Boolean[] trueOFalse = {11 > 89, (12-2) > (2*4), 12 == (3*4), 0>0};
        System.out.println(trueOFalse[3]);
        System.out.println(trueOFalse[2]);
        System.out.println(trueOFalse[1]);
        System.out.println(trueOFalse[0]);
    }

}
