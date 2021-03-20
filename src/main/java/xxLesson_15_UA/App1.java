package xxLesson_15_UA;

public class App1 {
    public static void main(String[] args) {
        fizzBuzz(100);
    }

    private static void fizzBuzz(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i%5== 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);

        }
    }
}

//    private static void fizzBuzz(int limit) {
//        for(int i = 1; i <= limit; i++){
//            if(i%3==0 && i==0){
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
