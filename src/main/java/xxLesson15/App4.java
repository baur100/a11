package xxLesson15;

public class App4 {
    public static void main(String[] args) {
        int[] array = {5, 3, 10, 7, 15, 18, 11, 64, 97};

        int[] primeNumbers = getPrime(array);
        for(int v:primeNumbers){
            System.out.println(v+" ");
        }
    }
    private static int[] getPrime(int[] numbers){
        int primeCount = 0;
        for(int v:numbers){
            if(isPrime(v)){
                primeCount++;
            }
        }
        int[] prime = new int[primeCount];
        int index = 0;
        for(int v:numbers){
            if(isPrime(v)){
               prime[index]=v;
               index++;
            }
        }
        return prime;
    }
    private static boolean isPrime(int number){
        for(int i=2;i<number;i++){
            if(number%i==0){
                return false;
            }
        }return true;
    }
}
