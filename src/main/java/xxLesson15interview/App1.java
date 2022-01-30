package xxLesson15interview;

public class App1 {
    public static void main(String[] args) {
        fizzbuzz(100);

    }
//     private static void fizzbuzz(int limit) {
//        for (int i = 1; i<=limit;i++){
//            if(i%3==0 && i%5==0){
//                System.out.println(i+" - FizzBuzz");
//                continue;
//            }
//            if(i%3==0){
//                System.out.println(i+" - Fizz");
//                continue;
//            }
//            if(i%5==0){
//                System.out.println(i+" - Buzz");
//                continue;
//            }
//            System.out.println(i);
//        }
//    }

    private static void fizzbuzz(int limit) {
        for(int i = 1; i<=limit;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if(i%3==0){
                System.out.println("Fizz");
            } else if(i%5==0){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

}
