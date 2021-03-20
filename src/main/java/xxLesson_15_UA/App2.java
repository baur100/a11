package xxLesson_15_UA;

public class App2 {
    public static void main(String[] args) {
        primeNumber(100);
    }

    private static void primeNumber(int limit){
        for (int i=2; i<limit;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int number){
        for (int i = 2; i<number; i++){
            if(number %i==0){
                return false;
            }
        }
        return true;
    }

}
