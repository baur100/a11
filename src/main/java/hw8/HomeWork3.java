package hw8;

import java.util.Arrays;

public class HomeWork3 {
    public static void main(String[] args) {


        int[] numbers = {1, 5, 543, 300, 32, 45, 76};
        System.out.println(Arrays.toString(numbers));

        String[] cars = new String[5];
        cars[0] = "Volvo";
        cars[1] = "Mercedes";
        cars[2] = "BMW";
        cars[3] = "Aston Martin";
        cars[4] = "Tesla";
        System.out.println(Arrays.toString(cars));

        boolean[] trueOrFalse = {true, false, 8 > 9, 8 < 9, 9 == 9,};
        System.out.println(Arrays.toString(trueOrFalse));

        int[] number = {1, 5, 544, 46, 7, 35, 89};
        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }

        String[] fish = new String[5];
        fish[0] = "Tuna";
        fish[1] = "Salmon";
        fish[2] = "Bass";
        fish[3] = "Grouper";
        fish[4] = "Barracuda";

        for (int i = 0; i < fish.length; i++) {
            System.out.println(fish[i]);
        }
        boolean[] trueFalse = {true, false, 8 > 9, 8 < 9, 9 == 9,};
        for (int i = 0; i < trueFalse.length; i++) {
            System.out.println(trueFalse[i]);
        }
    }

}
