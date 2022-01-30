package xxLesson15interview;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        boolean isAnagram = checkAnagram("Night1", "Thing2");
        System.out.println(isAnagram);
    }

    private static boolean checkAnagram(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        String capitalsWord1 = word1.toUpperCase();
        String capitalsWord2 = word2.toUpperCase();

        char[]w1 = capitalsWord1.toCharArray();
        char[]w2 = capitalsWord2.toCharArray();

        Arrays.sort(w1);
        Arrays.sort(w2);
        System.out.println(w1);
        System.out.println(w2);

        for (int i=0;i<w1.length;i++){
            if(w1[i]!=w2[i]){
                return false;
            }
        }
        return true;
    }
}
