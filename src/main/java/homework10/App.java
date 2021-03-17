package homework10;

public class App {
    public static void main(String[] args) {
        //Manager subclass
        Manager manager1 = new Manager("John", "Doe", 2015, true, 75000, 5000);
        Manager manager2 = new Manager("Jill", "Valentine", 2010, false, 8000, 7000);
        //Salesperson subclass
        Salesperson sales1 = new Salesperson("Super", "Papa", 2018, true, 10000, 25000);
        Salesperson sales2 = new Salesperson("Serious", "Girl", 2019, false, 6000, 20000);
        //Technician subclass
        Technician tech1 = new Technician("Johnny", "Walker", 2008, true, 30.0, 45.0);
        Technician tech2 = new Technician("Nick", "Fury", 2003, false, 40, 60.0);

        //Print outs
        String johnDoeInfo = manager1.toString();
        System.out.println(johnDoeInfo);
        String jillValentineInfo = manager2.toString();
        System.out.println(jillValentineInfo);
        String superPapaInfo = sales1.toString();
        System.out.println(superPapaInfo);
        String srsGirlInfo = sales2.toString();
        System.out.println(srsGirlInfo);
        String johnnyWalkerInfo = tech1.toString();
        System.out.println(johnnyWalkerInfo);
        String nickFuryInfo = tech2.toString();
        System.out.println(nickFuryInfo);
    }
}
