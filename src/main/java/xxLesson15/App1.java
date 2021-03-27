package xxLesson15;

public class App1 {
    public static void main(String[] args) {
        fizzbuzz(100);

    }
     //for an array between 1 and 100, print out fizz if nymber is divisible by 3, print buzz if number is divisible by 5, print fizzbuzz
    //if nunmber is divisible by 3 and 5
    private static void fizzbuzz(int limit) {
        for (int i = 1; i<=limit;i++){
            //if number is divisible by 3 and 5, print out fizzbuzz
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
                continue;
            }
            //if number is divisible by 3, print out fizz
            if(i%3==0){
                System.out.println("Fizz");
                continue;
            }
            //if nunber is divisible by 5, print out Buzz
            if(i%5==0){
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }

//    private static void fizzbuzz(int limit) {
//        for(int i = 1; i<=limit;i++){
//            if(i%3==0 && i%5==0){
//                System.out.println("FizzBuzz");
//            } else if(i%3==0){
//                System.out.println("Fizz");
//            } else if(i%5==0){
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }
//    }

}
