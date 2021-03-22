package hw11_UA;

public class App {
    public static void main(String[] args) {

        // <<1st Computer>>

        Mouse mouse1 = new Mouse("Apple ", "Mouse 2 ", true );
        Keyboard keyboard1 = new Keyboard("Apple ", "Magic Keyboard 2 ",true);

        Monitor monitor1 = new Monitor("Samsung ", "UR55 Series");
        Monitor monitor2 = new Monitor("LG ", "29WL500-B");
        Monitor[]monitors1 = {monitor1, monitor2};

        DiskType diskType1 = DiskType.HDD;
        Disk disk1 = new Disk("Macintosh HD ", false, 256, diskType1);
        Memory memory1 = new Memory("CORSAIR", "CMSA8GX3M2A1066C7 ", "8GB");
        GraphicCard graphicCard1 = new GraphicCard("Intel ", "Iris Pro 1536 MB");
        Processor processor1 = new Processor("Intel Core i7 ", "2 GHz Quad-Core");

        MotherBoard motherBoard1 = new MotherBoard(memory1, "Intel", "DQ67SW", graphicCard1, processor1);

        PowerSupply powerSupply1 = new PowerSupply("Apple", "A1289");

        SystemBlock systemBlock1 = new SystemBlock(disk1, motherBoard1, powerSupply1);

        Computer computer1 = new Computer(mouse1, keyboard1, monitors1, systemBlock1);


        // <<2nd Computer>>

        Mouse mouse2 = new Mouse("Razer ", "Basilisk X Hyperspeed ", true );
        Keyboard keyboard2 = new Keyboard("Logitech ", "K600 TV ",true);

        Monitor monitor3 = new Monitor("Samsung ", "T350 Series");
        Monitor monitor4 = new Monitor("HP ", "V21-B");
        Monitor[]monitors2 = {monitor3, monitor4};

        DiskType diskType2 = DiskType.SSD;
        Disk disk2 = new Disk("Macintosh HD ", false, 256, diskType1);
        Memory memory2 = new Memory("CORSAIR", "CMSA8GX3M2A1066C7 ", "8GB");
        GraphicCard graphicCard2 = new GraphicCard("Intel ", "Iris Pro 1536 MB");
        Processor processor2 = new Processor("Intel Core i7 ", "10th Generation Core i5");

        MotherBoard motherBoard2 = new MotherBoard(memory2, "Intel", "DQ67SW", graphicCard2, processor2);

        PowerSupply powerSupply2 = new PowerSupply("Dell", "NPS-230DB A");

        SystemBlock systemBlock2 = new SystemBlock(disk1, motherBoard1, powerSupply1);

        Computer computer2 = new Computer(mouse2, keyboard2, monitors2, systemBlock2);


        // <<1st Computer>>
        System.out.println("1st Computer");

        // Get cpu model name and brand:
        Processor firstComputer = (computer1.getSystemBlock().getMotherBoard().getCpu());
        System.out.println(firstComputer);

        // Get disk type:
        DiskType firstComputerDisk = (computer1.getSystemBlock().getDisk().getType());
        System.out.println(firstComputerDisk);

        System.out.println(" ");

        // <<2nd Computer>>
        System.out.println("2nd Computer");

        // Get cpu model name and brand:
        Processor secondComputer = (computer2.getSystemBlock().getMotherBoard().getCpu());
        System.out.println(secondComputer);

        // Get disk type;
        DiskType secondComputerDisk = (computer2.getSystemBlock().getDisk().getType());
        System.out.println(secondComputerDisk);

    }
}
