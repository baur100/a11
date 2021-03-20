package xxLesson_15_UA;

import java.util.HashSet;
import java.util.Set;

public class Duplicated {
    public static void main(String[] args) {
        int[] number = {1, 4, 5, 89, 9, 9, 12, 2, 11, 12, 67, 89, 1};
        Set<Integer> set = new HashSet<>();

        for (int n : number){
            set.add(n);
        }

        for (int n : set){
            int count = 0;
            for(int v : number){
                if (n == v){
                    count++;
                }
            }
            if (count>1){
                System.out.println(n);
            }
        }

    }
}
