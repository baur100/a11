package hw11;

public class SystemBlock {
    private Disk disk;
    private MotherBoard motherBoard;
    private PowerSupply powerSupply;

    public SystemBlock(Disk disk, MotherBoard motherBoard, PowerSupply powerSupply) {
        this.disk = disk;
        this.motherBoard = motherBoard;
        this.powerSupply = powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    @Override
    public String toString() {
        return "SystemBlock{" +
                "disk=" + disk +
                ", motherBoard=" + motherBoard +
                ", powerSupply=" + powerSupply +
                '}';
    }
}
