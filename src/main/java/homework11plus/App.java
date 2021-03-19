package homework11plus;

public class App {
    public static void main(String[] args) {
        //Computer 1
        Processor processor1 = new Processor("AMD", "Ryzen 5600X");
        Memory memory1 = new Memory("G.Skill", "Ripjaw V");
        GraphicCard graphicCard1 = new GraphicCard("Gigabyte", "Radeon RX 590");
        Motherboard motherboard1 = new Motherboard("MSI", "X570-A PRO", processor1, memory1, graphicCard1);
        Storage storage1 = new Storage("Samsung", "870 EVO", 500, StorageType.SSD);
        PowerSupply powerSupply1 = new PowerSupply("Cooler Master", "V750 Gold V2");
        ComputerCase computerCase1 = new ComputerCase("Cooler Master", motherboard1, storage1, powerSupply1);
        Keyboard keyboard1 = new Keyboard("Corsair", "Gaming K55", false);
        Mouse mouse1 = new Mouse("Razor", "Mamba Gaming", true);
        Monitor monitor1 = new Monitor("Dell", "U2719D");
        Monitor monitor2 = new Monitor("Acer", "ED272");
        Monitor[] monitorSet1 = new Monitor[]{monitor1, monitor2};

        Computer computer1 = new Computer(computerCase1, keyboard1, mouse1, monitorSet1);

        //Print out computer 1
        String computerInfo1 = computer1.toString();
        System.out.println(computerInfo1);

        //Computer 2
        Processor processor2 = new Processor("Intel", "Core i9 10900K");
        Memory memory2 = new Memory("Crucial", "Ballistx");
        GraphicCard graphicCard2 = new GraphicCard("MSI","GeForce RTX 3060");
        Motherboard motherboard2 = new Motherboard("ASUS", "Prime Z490-A", processor2, memory2, graphicCard2);
        Storage storage2 = new Storage("Seagate", "Barracuda 510", 512, StorageType.SSD);
        PowerSupply powerSupply2 = new PowerSupply("Thermaltake", "Toughpower GF1");
        ComputerCase computerCase2 = new ComputerCase("Thermaltake", motherboard2, storage2, powerSupply2);
        Keyboard keyboard2 = new Keyboard("Logitech", "G413 Mechanical", false);
        Mouse mouse2 = new Mouse("Logitech", "G502 Lightspeed", true);
        Monitor monitor3 = new Monitor("MSI", "G27C2");
        Monitor monitor4 = new Monitor("ASUS", "XG279Q");
        Monitor[] monitorSet2 = new Monitor[]{monitor3, monitor4};

        Computer computer2 = new Computer(computerCase2, keyboard2, mouse2, monitorSet2);

        //Print out computer 2
        String computerInfo2 = computer2.toString();
        System.out.println(computerInfo2);
    }
}
