package xxLesson15interview;

public class AppAvarege {
    public static void main(String[] args) {
        int[] array = {5, 3, 10, 7, 15, 18, 11, 64, 97};

        int average = getAverage(array);
        System.out.println(average);

    }

    public static int  getAverage(int[] numbers){
        int count = 0;
        for(int v:numbers){
            count++;
        }
        int x=0;
        for(int v:numbers){
            x=x+v;
            x++;
        }
        return x/count;
    }
}
