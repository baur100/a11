package homework10;

public class Salesperson extends Employee {
    private int basePay;
    private int commission;

    public Salesperson(String firstName, String lastName, int yearJoined, boolean employed, int basePay, int commission){
        super(firstName, lastName, yearJoined, employed);
        this.basePay = basePay;
        this.commission = commission;
    }

    public Salesperson(){}

    public int getBasePay(){
        return basePay;
    }

    public void setBasePay(int pay){
        this.basePay = pay;
    }

    public int getCommission(){
        return commission;
    }

    public void setCommission(int pay){
        this.commission = pay;
    }

    @Override
    public String toString() {
        return "Salesperson{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearJoined=" + yearJoined +
                ", employed=" + employed +
                ", basePay=" + basePay +
                ", commission=" + commission +
                '}';
    }
}
