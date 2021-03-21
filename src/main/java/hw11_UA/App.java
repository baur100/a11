package hw11_UA;

public class App {
    public static void main(String[] args) {

        // <<1st Computer>>
        Mouse apple = new Mouse("Apple ", "Mouse 2 ", true );
        Keyboard magicKeyboard = new Keyboard("Apple ", "Magic Keyboard 2 ",true);

        Monitor monitor1 = new Monitor("Samsung ", "UR55 Series");
        Monitor monitor2 = new Monitor("LG ", "29WL500-B");
        Monitor[]monitors1 = {monitor1, monitor2};

        DiskType diskType1 = DiskType.HDD;
        Disk disk1 = new Disk("Macintosh HD ", false, 256, diskType1);

        Memory memory1 = new Memory("CORSAIR", "CMSA8GX3M2A1066C7 ", "8GB");
        GraphicCard graphicCard1 = new GraphicCard("Intel ", "Iris Pro 1536 MB");
        Processor processor1 = new Processor("Intel Core i7 ", "2 GHz Quad-Core");


        // <<2nd Computer>>
        Mouse LogiTech = new Mouse("Razer ", "Basilisk X Hyperspeed ", true );
        Keyboard magicKeyboard1 = new Keyboard("Logitech ", "K600 TV ",true);

        Monitor monitor3 = new Monitor("Samsung ", "T350 Series");
        Monitor monitor4 = new Monitor("HP ", "V21");
        Monitor[]monitors2 = {monitor3, monitor4};

        DiskType diskType2 = DiskType.SSD;
        Disk disk2 = new Disk("Macintosh HD ", false, 256, diskType1);

        Memory memory2 = new Memory("CORSAIR ", "CMSA8GX3M2A1066C7 ", "8GB");
        GraphicCard graphicCard2 = new GraphicCard("Intel ", "Iris Pro 1536 MB");
        Processor processor2 = new Processor("Intel ", "10th Generation Core i5");


        // <<1st Computer>>
        System.out.println("1st Computer");

        // Get cpu model name and brand:
        String computer1cpu = (processor1.getBrand() + processor1.getModel());
        System.out.println("CPU info: " + computer1cpu);

        // Get disk type:
        System.out.println("Disk info: " + diskType1);

        System.out.println(" ");

        // <<2nd Computer>>
        System.out.println("2nd Computer");

        // Get cpu model name and brand:
        String computer2cpu = (processor2.getBrand() + processor2.getModel());
        System.out.println("CPU info: " + computer2cpu);

        // Get disk type;
        System.out.println("Disk info: " + diskType2);
    }
}
