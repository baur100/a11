package hw10Enums;

public class App {
    public static void main(String[] args) {
        PackageSize[] packageSizes = {PackageSize.BIG, PackageSize.SMALL, PackageSize.LARGE};
        Manager first = new Manager("Done", 2021, "Package.BAG", packageSizes);
        System.out.println(first);
    }
}
