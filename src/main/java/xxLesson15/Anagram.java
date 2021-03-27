package xxLesson15;

import java.util.Arrays;
import java.util.Locale;

//verifying if  "Night1" and "Thing2" are anagrams

public class Anagram {
    public static void main(String[] args) {
        boolean isAnagram = checkAnagram("Night1", "Thing2");
        System.out.println(isAnagram);
    }

    private static boolean checkAnagram(String word1, String word2) {
        //testing to see if both words are the same length. if no, then no way to check for anagram.
        if(word1.length()!=word2.length()){
            return false;
        }

        //changing both words to all Caps..makes anagram comparison easier
        String capitalsWord1 = word1.toUpperCase();
        String capitalsWord2 = word2.toUpperCase();

        //copying each word (now upppercase) into its own array

        char[]w1 = capitalsWord1.toCharArray();
        char[]w2 = capitalsWord2.toCharArray();

        //sort each array
        Arrays.sort(w1);
        Arrays.sort(w2);
        System.out.println(w1);
        System.out.println(w2);

        //compare each sorted array. 

        for (int i=0;i<w1.length;i++){
            if(w1[i]!=w2[i]){
                return false;
            }
        }
        return true;
    }
}
