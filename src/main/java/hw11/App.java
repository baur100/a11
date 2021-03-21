package hw11;

public class App {
    public static void main(String[] args) {
        Mouse mouse1=new Mouse("Logitech","M510",true);
        Keybord keybord1=new Keybord("Logitech","MK335",true);
        Monitor monitorHomeAser= new Monitor("Aser","SB220Q");
        Monitor monitorHomeHP= new Monitor("HP","B08BF4CZSV ");
        Monitor[] monitors={monitorHomeAser,monitorHomeHP};

        SystemBlock mysystemBlock1=new SystemBlock(new Disk("Barracuda",false,2,DickType.HDD),new MotherBoard(new Memory("A-Tech","B00C53GN1U","SDRAM DDR3",16),"ASUS","Prime Z390-A",new GraphicCard("Gigabyte","FBA_GV-N105TOC-4GL","GeForce GTX 1050 Ti ",4),new Processor("Intel","Core i7",2.9,20)),new PowerSupply("IN WIN","P 85"));

        Computer computer1= new Computer(mouse1,keybord1,monitors,mysystemBlock1);
        String cpuModel=mysystemBlock1.getMotherBoard().getCpu().getModel();
        String cpuBrand=mysystemBlock1.getMotherBoard().getCpu().getBrand();
        DickType dickType=mysystemBlock1.getDisk().getType();
        System.out.println(cpuModel);
        System.out.println(cpuBrand);
        System.out.println(dickType);


        Mouse mouse2=new Mouse("Bengo","KM-1",true);
        Keybord keybord2=new Keybord("Azio","KB505U",false);
        Monitor monitorHomeLG=new Monitor("LG","24M47VQ");
        Monitor monitorHomeViewSonic=new Monitor("ViewSonic","Elite XG270");
        Monitor[] monitors1={monitorHomeLG,monitorHomeViewSonic};

        SystemBlock mysystemBlock2=new SystemBlock(new Disk("Barracuda",false,2,DickType.SSD),new MotherBoard(new Memory("Timetec","FBA_75TT160UL1R8-4G","DDR3 SDRAM",16),"MSI","MAG B550 TOMAHAWK",new GraphicCard("ASRock","90-GA0K00-00UANF ","GDDR5",4),new Processor("Intel","Core i9",3.6,20)),new PowerSupply("Corsair","RMx"));

        Computer computer2=new Computer(mouse2,keybord2,monitors1,mysystemBlock2);
        String cpuModel2=mysystemBlock2.getMotherBoard().getCpu().getModel();
        String cpuBrand2=mysystemBlock2.getMotherBoard().getCpu().getBrand();
        DickType dickType2=mysystemBlock2.getDisk().getType();
        System.out.println(cpuModel2);
        System.out.println(cpuBrand2);
        System.out.println(dickType2);

    }
}
