package xxLesson15interview;

import java.util.Random;

public class Dices {
    public static void main(String[] args) {
        int[]dices=getDices(5);
        for(int dice:dices){
            System.out.println(dice);
        }
        int rotations = 0;
        for(int dice:dices){
            if(dice==1){
                rotations=rotations+2;
                continue;
            }
            if(dice==6){
                continue;
            }
            rotations++;
        }
        System.out.println("result = "+rotations);
    }

    private static int[] getDices(int numberOfDices){
        int[] dices = new int[numberOfDices];
        Random random = new Random();
        for(int i=0;i<numberOfDices;i++){
            dices[i]= random.nextInt(6)+1;
        }
        return dices;
    }
}
