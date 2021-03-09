package hw8;

import java.util.Arrays;

public class Work {
    public static void main(String[] args){
        int[]together = {2,3,5,6,7,8};
        int[]toBeSorted = {3,9,1,8,4,8,5};
        int added = sum(together);
        int smallest = minimum(toBeSorted);
        int maxNum = maximum(toBeSorted);
        sort(toBeSorted);
        System.out.println(added);
        System.out.println(sum(together));
        System.out.println(smallest);
        System.out.println(maxNum);
    }
    public static int sum(int[]numbers){
        int x = 0;
        for (int number : numbers){
            x = number + x;
        }
        return x;
    }
    public static void sort(int[]numbers2){
        int[]sortedArray = new int[numbers2.length];
        boolean notSorted = true;
        int x = 0;
        int first = minimum(numbers2);
        sortedArray[0] = first;
        while (notSorted) {
            for (int number : numbers2) {
                if (number == first) {
                    sortedArray[x] = number;
                    x++;
                }
            }
            first++;
            if (sortedArray[x-1] == maximum(numbers2)) {
                notSorted = false;
            }
        }
        System.out.println(Arrays.toString(sortedArray));
        for (int number : sortedArray){
            System.out.println(number);
        }

    }
    public static int minimum(int[]numbers3){
        int min = numbers3[0];
        for (int number:numbers3){
            if(number<min){
                min = number;
            }
        }
        return min;
    }

    public static int maximum(int[]numbers4){
        int max = numbers4[0];
        for (int number:numbers4){
            if(number>max){
                max = number;
            }
        }
        return max;
    }
}
