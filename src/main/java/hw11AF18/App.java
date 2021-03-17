package hw11AF18;

public class App {
    public static void main(String[] args) {

        //Computer #1
        Monitor[] m1 = {new Monitor("LG", "34WL500"), new Monitor("LG", "34WL500")};
        Computer pc1 = new Computer(
                new Mouse("Skytech Gaming", "M-1000", false),
                new Keyboard("Skytech Gaming", "K-1000", false), m1,
                new SystemBlock(
                        new Disk("Seagate", "Iron Wolf", 6, DiskType.SSD),
                        new MotherBoard(
                                new Memory("RAM", 2), "Gigabyte", "H370ML",
                                new GraphicCard("NVIDIA", 4, "GT 1020"),
                                new Processor("Intel", "Core I-7", 2.2, 16)),
                        new PowerSupply("EVGA", "SuperNova2000")));

        //Computer #2
        Computer pc2 = new Computer();
        pc2.setMouse(new Mouse("Logitech", "MS-1000", true));
        pc2.setKeyboard(new Keyboard("Asus", "Pro-20", true));

        Monitor[] m2 = {new Monitor("Dell", "32UHD NANO"), new Monitor("Dell", "32 UHD NANO")};
        pc2.setMonitors(m2);

        SystemBlock sb1 = new SystemBlock();
        sb1.setDisk(new Disk("Sabrent", "Rocket", 1, DiskType.HDD));
        MotherBoard mb1 = new MotherBoard();
        mb1.setMemory(new Memory("RAM", 4));
        mb1.setBrand("Asus");
        mb1.setModel("ROG STRIX");
        mb1.setGraphicCard(new GraphicCard("MSI GT", 2, "GT 710"));
        mb1.setCpu(new Processor("Intel", "Core I-5", 2.4, 18));

        pc2.setSystemBlock(sb1);
        sb1.setMotherBoard(mb1);
        sb1.setPowerSupply(new PowerSupply("EVGA", "NEXT GEN 4000"));

        // Получаем название модели и марку процессора
        System.out.println("Computer #1 has: "+pc1.getSystemBlock().getMotherBoard().getCpu().getBrand() + " " + pc1.getSystemBlock().getMotherBoard().getCpu().getModel());

        System.out.println("Computer #2 has: "+pc2.getSystemBlock().getMotherBoard().getCpu().getBrand() + " " + pc2.getSystemBlock().getMotherBoard().getCpu().getModel());

        // Получить тип диска;
        System.out.println("Computer #1 has: "+pc1.getSystemBlock().getDisk().getType());
        System.out.println("Computer #2 has: "+pc2.getSystemBlock().getDisk().getType());
    }
}
