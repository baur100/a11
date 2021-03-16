package homework3_13;

public class App2 {
    public static void main(String[] args) {
        HomeImprovement drill=new HomeImprovement("Drill",TypeDrill.Driver,CordStyle.CORDLESS);
        System.out.println(drill);

        Mattress mymattress=new Mattress("Linespa","Plash",Size1.Queen);
        System.out.println(mymattress);
    }
}
