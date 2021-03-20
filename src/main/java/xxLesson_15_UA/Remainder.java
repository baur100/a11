package xxLesson_15_UA;

public class Remainder {
    public static void main(String[] args) {
        int a = 100;
        int b = 103;
        int r1 = remainder1(a, b);
        System.out.println(r1);
        int r2 = remainder2(a,b);
        System.out.println(r2);
    }

    private static int remainder2(int a, int b) {
        return a-((int) a/b)*b;
    }

    private static int remainder1(int a, int b) {
        while(a>=b){
            a = a-b;
        }
        return a;
    }
}
