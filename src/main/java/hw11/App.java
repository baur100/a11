package hw11;

public class App {
    public static void main(String[] args) {
        Memory atx = new Memory("Asus",512);
        PowerSupply pwr = new PowerSupply("yikes","txx100");
        GraphicCard r2400 = new GraphicCard("Nvidia","2GB");
        Mouse lg = new Mouse("LG","silent",true);
        Keyboard samsung = new Keyboard("Samsung","light",true);
        Monitor acer1 = new Monitor("acer","tx100");
        Monitor acer2 = new Monitor("acer1","tx1002");
        Monitor[]acer = {acer1,acer2};
        Disk kingston = new Disk("kingston","250",true,250,DiskType.HDD);
        Disk kingstonplus = new Disk("kingston","500",true,500,DiskType.SSD);

        Processor usual = new Processor("best","intel","i7");
        Processor usual2 = new Processor("superbest","AMD","ryzen10000");
        MotherBoard rtw = new MotherBoard(atx,"Asus","240",r2400,usual);
        MotherBoard rtwplus = new MotherBoard(atx,"Asus","240",r2400,usual2);
        SystemBlock standard = new SystemBlock(kingston,rtw,pwr);
        SystemBlock standardplus = new SystemBlock(kingstonplus,rtwplus,pwr);






        Computer surface = new Computer(lg,samsung,acer,standard);
        Computer surface2 = new Computer(lg,samsung,acer,standardplus);

        String cpu1Model = surface.getSystemBlock().getMotherBoard().getCpu().getModel();
        String cpu1Name = surface.getSystemBlock().getMotherBoard().getCpu().getName();
        String cpu1Brand = surface.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String cpu1disk = surface.getSystemBlock().getDisk().getType().toString();

        String cpu2Model = surface2.getSystemBlock().getMotherBoard().getCpu().getModel();
        String cpu2Name = surface2.getSystemBlock().getMotherBoard().getCpu().getName();
        String cpu2Brand = surface2.getSystemBlock().getMotherBoard().getCpu().getBrand();
        String cpu2disk = surface2.getSystemBlock().getDisk().getType().toString();
        String monitor1 = surface.getMonitors()[0].getModel();

        System.out.println("cpu model is " + cpu1Model + "cpu name is " + cpu1Name + "cpu brand is " + cpu1Brand);
        System.out.println("disktype is " + cpu1disk);
        System.out.println("cpu model is " + cpu2Model + "cpu name is " + cpu2Name + "cpu brand is " + cpu2Brand);
        System.out.println("disktype is " + cpu2disk);

        // Create 2 computers
        // Get cpu model name and brand
        // Get disk type;

    }
}
