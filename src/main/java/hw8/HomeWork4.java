package hw8;

import java.util.Arrays;

public class HomeWork4 {
    public static void main(String[] args) {

        int[] numbers = {2, 76, 9, 90, 31, 76, 6, 88, 21, 12};
        System.out.println(Arrays.toString(numbers));

        //printing all values in the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        //printing only numbers evenly divisible by 2
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                System.out.println(numbers[i]);
            }
        }

        //printing only numbers evenly divisible by 3
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0) {
                System.out.println(numbers[i]);
            }
        }

        //print out the maximum value
        int max = numbers[0];
        for (int i : numbers) {
            if (i > max) {
                max = i;
                System.out.println(i);
            }
        }

        //print out the minimum value

        int min = numbers[0];
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("min =" + min);

        //print out only odd numbers

        for (int number : numbers) {
            if (number % 2 == 1 || number % 2 == -1) {
                System.out.println(number);

            }
        }

        //print out only the index for value of ten

        int[] newArray = {10, 15, 12, 7, 88, 10, 6, 17, 23, 10, 10, 16};
        int index = 0;
        for (int array : newArray) {
            if (array == 10) {
                System.out.println(index);
            }
            index++;
        }


    }


};
