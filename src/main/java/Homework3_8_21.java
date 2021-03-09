import java.util.Arrays;

public class Homework3_8_21 {
    public static void main(String[] args) {
        double sum = getSum(2, 3, 5, 6, 7, 8);
        System.out.println(sum);

        int[] arr = {3, 9, 1, 8, 4, 8, 5};
        int min = getMinFromArray(arr);
        System.out.println("Array min =` " + min);

        int[] array = {3, 9, 1, 8, 4, 8, 5};
        Arrays.sort(array);
        int i = 0;
        for (int v : array) {
            System.out.println(array[i]);
            i++;
        }

    }

    public static double getSum(int a, int b, int c, int d, int e, int f) {
        double sum = a + b + c + d + e + f;
        return sum;
    }

    public static int getMinFromArray(int[] array) {
        int m = array[0];
        for (int v : array) {
            if (v < m) ;
        }
        return m;
    }

    public static void sort(int[] array) {

    }
}
