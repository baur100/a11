package homework11plus;

public class ComputerCase {
    private String name;
    private Motherboard board;
    private Storage drive;
    private PowerSupply powerSupply;

    public ComputerCase(String name, Motherboard board, Storage drive, PowerSupply powerSupply){
        this.name = name;
        this.drive = drive;
        this.board = board;
        this.powerSupply = powerSupply;
    }

    public ComputerCase(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Storage getDrive(){
        return drive;
    }

    public Motherboard getBoard(){
        return board;
    }

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setDrive(Storage drive) {
        this.drive = drive;
    }

    public void setBoard(Motherboard board) {
        this.board = board;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "ComputerCase{" +
                "name='" + name + '\'' +
                ", board=" + board +
                ", drive=" + drive +
                ", powerSupply=" + powerSupply +
                '}';
    }
}