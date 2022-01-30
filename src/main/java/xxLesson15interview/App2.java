package xxLesson15interview;

public class App2 {
    public static void main(String[] args) {
        primeNumbers(100);
    }

    private static void primeNumbers(int limit) {
        for (int i=2;i<limit;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i=2; i<number;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}
