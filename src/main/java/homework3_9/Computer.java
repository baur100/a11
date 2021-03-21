package homework3_9;

public class Computer {
    public String type;
    public String brand;
    public String operatingSystem;
    public int screenSize;
    public String cpuModel;
    public int memorySize;

    public String getComputer(){
        return "Computer "+"\nType: "+type+"\nBrand: "+brand+"\nOperating System: "+operatingSystem+"\nScreen Size: "+screenSize+"\nCPU Model: +"+cpuModel+"\nMemory Size: "+memorySize;
    }
}
