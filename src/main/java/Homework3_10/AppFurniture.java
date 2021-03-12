package Homework3_10;

public class AppFurniture {
    public static void main(String[] args) {
        Furniture sofa=new Furniture();

        sofa.setType("Sofa");
        sofa.setColor("Brown");
        sofa.setPrice(349.99);
        sofa.setQty(5);
        System.out.println(sofa.getType());
        System.out.println(sofa.getColor());
        System.out.println(sofa.getPrice());
        System.out.println(sofa.getQty());

        String furniture = sofa.getFurnitureInfo();
        System.out.println(furniture);

        Furniture dressers=new Furniture("Dressers","White",119.99,4);

        System.out.println(dressers.getType());
        System.out.println(dressers.getColor());
        System.out.println(dressers.getPrice());
        System.out.println(dressers.getQty());
    }
}
