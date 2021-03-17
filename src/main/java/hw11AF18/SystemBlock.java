package hw11AF18;

public class SystemBlock {
    private Disk disk;
    private MotherBoard motherBoard;
    private PowerSupply powerSupply;

    public SystemBlock(){};
    public SystemBlock(Disk disk, MotherBoard motherBoard, PowerSupply powerSupply) {
        this.disk = disk;
        this.motherBoard = motherBoard;
        this.powerSupply = powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "SystemBlock " +
                "\ndisk= " + disk +
                "\nmotherBoard= " + motherBoard +
                "\npowerSupply= " + powerSupply;
    }
}
