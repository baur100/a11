package xxLesson15interview;

import java.util.HashSet;
import java.util.Set;

public class Duplicate {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,89,8,9,9,0,12,2,11,12,67,89,1,89};
        Set<Integer> set = new HashSet<>();

        for(int n: numbers){
            set.add(n);
        }
        System.out.println(set);

        for (int n :set){
            int count = 0;
            for(int v : numbers){
                if(n==v){
                    count++;
                }
            }
            if(count>1){
                System.out.println(n);
            }
        }
    }
}
