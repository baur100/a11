package lesson16;

public class App1 {
    public static void main(String[] args) {

        System.out.println("Program starts");

        int[] arr = {2, 2, 3};
        int a = 5;
        int b = 1;

        System.out.println("Before try/catch");
        try {
            Person ann = new Person("Ann", "Wilson", 1999);
            System.out.println("After first error");
            double c = a / b;
            System.out.println("After second error");
            arr[7] = 8;
            System.out.println("After third error");
        }catch (IllegalArgumentException err){
            System.out.println("in the illegal argument catch block");
        } catch (ArithmeticException err){
            System.out.println("math exception");
//            throw new ArithmeticException(err.getMessage());
        } catch (ArrayIndexOutOfBoundsException err){
            System.out.println("out of bound catch");
        } finally {
            System.out.println("will run in any case");
        }
        System.out.println("Program finished");
    }
}
