public class Lesson6b {
    static public void main (String[] args){
        int[] main = {3,9,1,8,4,8,5};
        int sum = 0;
        for (int numbers : main) {
            sum += numbers;
            System.out.print("Sum = ");
            System.out.println(sum);
        }
    }
}
