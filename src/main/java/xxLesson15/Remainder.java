package xxLesson15;

public class Remainder {
    public static void main(String[] args) {

        int a=100;
        int b=21;
        int r1 = remainder1(a,b);
        System.out.println(r1);
        int r2  = remainder2(a,b);
        System.out.println(r2);
    }

    private static int remainder2(int a, int b) {
        return a-(a/b)*b;
    }


    private static int remainder1(int a, int b) {
        while(a>=b){
            a-=b;
        }
        return a;
    }

}
