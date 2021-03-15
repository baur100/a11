package lesson10;

// create 2 object of each class (including superclass - don't make it abstract)

public class AppHomework10 {

    public static void main(String[] args) {

        Doctor doc = new Doctor("Baptist", 200000, 1000) ;
        System.out.println(doc.toString());
        System.out.println("**************************");

        String[] cond_list = {"high_BP", "high_Cholestrol" ,"CHD", "arrhythmias", "CHF"};
        String[] areas_list = {"medical", "radiation", "surgical"};
        boolean performs_surgery = true;


        Cardiologist jack = new Cardiologist("Montgomery", 500000, 2000, cond_list);
        System.out.print("This doctor is a " );
        System.out.println(jack);
        System.out.println("**************************");

        Oncologist john = new Oncologist("St Vincents", 550000, 3000, areas_list);
        System.out.print("This doctor is an " );
        System.out.println(john);

        System.out.println("**************************");

        NeuroSurgeon sanjay = new NeuroSurgeon("Memorial", 650000, 3000,performs_surgery);
        System.out.println("This doctor is a Neurosurgeon and it's "+sanjay.isSurgery() + ", he performs surgery");

    }

}