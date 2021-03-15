package hw9;

public class Computer {
    private String caseType;
    private String motherboard;
    private int ramSpeed;

    public Computer(String caseType, String motherboard, int ramSpeed) {
        this.caseType = caseType;
        this.motherboard = motherboard;
        this.ramSpeed = ramSpeed;
    }

    public Computer(){

    }

    public String getCaseType() {
        return caseType;
    }

    public void setCaseType(String caseType) {
        this.caseType = caseType;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }

    public int getRamSpeed() {
        return ramSpeed;
    }

    public void setRamSpeed(int ramSpeed) {
        this.ramSpeed = ramSpeed;
    }

    String returnComputer (String caseType, String motherboard, int ramSpeed) {
        String computerParameters;
        computerParameters = "Case Type: " + caseType + "\nMotherboard: " + motherboard + "\nRam Speed: " + ramSpeed;
        return computerParameters;
    }
    public void run(){
        System.out.println(caseType+ " "+ motherboard+ " "+ramSpeed);
    }



}
