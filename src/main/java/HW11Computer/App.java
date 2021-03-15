package HW11Computer;

public class App {
    public static void main(String[] args) {
        HddFormFactor[] hddFormFactors = {HddFormFactor.FORPC, HddFormFactor.FORLAPTOP};

        Mouse myMouse = new Mouse(NameOfBrands.LG, true);
        Keyboard myKeyboard = new Keyboard(NameOfBrands.LG, "En");
        Monitor[] myMonitors = {new Monitor(NameOfBrands.APPLE,"big"), new Monitor(NameOfBrands.LG,"large")};
        SystemBlock mySystemBlock = new SystemBlock(NameOfBrands.DELL, FormFactor.ATX);
        VedeoCard myVedeoCard = new VedeoCard(NameOfBrands.LG, GraphicsProcessing.AMDREDEON, VedeoMemory.GIGA10);
        Processors myProcessors = new Processors(NameOfBrands.DELL, NumberOfCores.CORE8, ProcessorSocket.AM4);
        Memory myMemory = new Memory(NameOfBrands.SAMSUNG, "256");
        HardDrive myHardDrive = new HardDrive("APPLE", 256, hddFormFactors);
        Motherbord myMotherbord = new Motherbord(NameOfBrands.SAMSUNG, ProcessorSocket.AM4, FormFactor.ATX);
        PowerSupplie myPowerSupplie = new PowerSupplie(NameOfBrands.DELL, "560");


        Computer firstComputer = new Computer(myMouse, myKeyboard, myMonitors, mySystemBlock,myVedeoCard,myProcessors,myMemory,myHardDrive, myMotherbord,myPowerSupplie);

        Computer secondComputer = new Computer();
        secondComputer.setProcessors(new Processors(NameOfBrands.INTEL,NumberOfCores.CORE10, ProcessorSocket.LGA1200));
        secondComputer.setHardDrive(new HardDrive("SAMSUNG", 256, hddFormFactors));
        secondComputer.setMouse(myMouse);
        secondComputer.setKeyboard(myKeyboard);
        secondComputer.setMonitors(myMonitors);
        secondComputer.setSystemBlock(mySystemBlock);
        secondComputer.setVedeoCard(myVedeoCard);
        secondComputer.setMemory(myMemory);
        secondComputer.setMotherbord(myMotherbord);
        secondComputer.setPowerSupplie(myPowerSupplie);



        System.out.println(firstComputer);
        System.out.println(secondComputer);


    }

}
