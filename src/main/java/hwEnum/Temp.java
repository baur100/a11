package hwEnum;

public class Temp extends Worker {
    private String level;
    private int contractLength;

    public Temp(String name, String lastname, int year, String level, int contractLength) {
        super(name, lastname, year);
        this.level = level;
        this.contractLength = contractLength;

    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getContractLength() {
        return contractLength;
    }

    public void setContractLength(int contractLength) {
        this.contractLength = contractLength;
    }
}

