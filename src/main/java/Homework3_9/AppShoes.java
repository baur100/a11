package Homework3_9;

public class AppShoes {
    public static void main(String[] args) {
        Shoes shoes1 = new Shoes();
        shoes1.type = "Sneakers";
        shoes1.brand = "ASICS";
        shoes1.gender = "Men";
        shoes1.color = "Blue";
        shoes1.size = 10;

        Shoes shoes2 = new Shoes();
        shoes2.type = "Boots";
        shoes2.brand = "UGG";
        shoes2.gender = "Woman";
        shoes2.color = "Brown";
        shoes2.size = 8;

        shoes1.forSell(12);
        shoes2.forSell(17);
    }

}
