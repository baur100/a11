package homework3_9;

public class AppComputer {
    public static void main(String[] args) {
        Computer forSell = new Computer();
        forSell.type = "Laptop";
        forSell.brand = "ASUS";
        forSell.operatingSystem = "Windows 10";
        forSell.screenSize = 15;
        forSell.cpuModel = "Intel Core i5";
        forSell.memorySize = 64;

        Computer forsell1 = new Computer();
        forsell1.type = "Desktop";
        forsell1.brand = "Dell";
        forsell1.operatingSystem = "Windows 10";
        forsell1.cpuModel = "Intel Core i5";
        forsell1.memorySize = 12;

        String computer = forSell.getComputer();
        System.out.println(computer);
        String computer1 = forsell1.getComputer();
        System.out.println(computer1);
    }
}
