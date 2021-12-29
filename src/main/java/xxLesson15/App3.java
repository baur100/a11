package xxLesson15;

public class App3 {
    public static void main(String[] args) {
//        fizzBass(100);
//
//        primeNumbers(100);

        int reminder = getReminder(20,6);
        System.out.println("Remainder = "+reminder);
        int rem = getReminder1(25,2);
        System.out.println("reminder1 = "+rem);


    }
    private static void primeNumbers(int limits){
        for(int i = 2; i<limits; i++){
            if(isPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    private static boolean isPrime(int number){
        for(int i = 2; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    private static void fizzBass(int limits){
        for(int i=1; i<limits; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" FizzBass");
            }else if(i%3==0){
                System.out.println(i+" Fizz");
            }else if(i%5==0){
                System.out.println(i+" Bass");
            }else {
                System.out.println(i);
            }
        }
    }

    private static int getReminder(int a, int b){
        return a-(a/b)*b;
    }

    private static int getReminder1(int a, int b){
        boolean cond = true;
        if(a<b){
            return a;
        }
        while(cond){
            a=a-b;
            if(a<b){
                cond=false;
            }
        }
        return a;
    }
}
