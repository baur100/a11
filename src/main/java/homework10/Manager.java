package homework10;

public class Manager extends Employee {
    private int salary;
    private int bonus;

    public Manager(String firstName, String lastName, int yearJoined, boolean employed, int salary, int bonus){
        super(firstName, lastName, yearJoined, employed);
        this.salary = salary;
        this.bonus = bonus;
    }

    public Manager(){

    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(int pay){
        this.salary = pay;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearJoined=" + yearJoined +
                ", employed=" + employed +
                ", salary=" + salary +
                ", bonus=" + bonus +
                '}';
    }
}
