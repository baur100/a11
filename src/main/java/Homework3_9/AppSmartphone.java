package Homework3_9;

public class AppSmartphone {
    public static void main(String[] args) {
        Smartphone smartphone1 = new Smartphone();
        smartphone1.brand = "Samsung";
        smartphone1.model = "Galaxy Note 10";
        smartphone1.color = "Black";
        smartphone1.screenSize = 6.2;
        smartphone1.releaseDate = 2019;

        Smartphone smartphone2 = new Smartphone();
        smartphone2.brand ="Apple";
        smartphone2.model = "Iphone 11";
        smartphone2.color = "Gold";
        smartphone2.screenSize = 6.1;
        smartphone2.releaseDate = 2019;

        smartphone1.soldout(150);
        smartphone2.soldout(170);

    }
}
