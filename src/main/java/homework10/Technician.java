package homework10;

public class Technician extends Employee {
    private double hourlyWage;
    private double overtimeWage;

    public Technician(String firstName, String lastName, int yearJoined, boolean employed, double hourlyWage, double overtimeWage){
        super(firstName, lastName, yearJoined, employed);
        this.hourlyWage = hourlyWage;
        this.overtimeWage = overtimeWage;
    }

    public Technician(){

    }

    public double getHourlyWage(){
        return hourlyWage;
    }

    public void setHourlyWage(double pay){
        this.hourlyWage = pay;
    }

    public double getOvertimeWage(){
        return overtimeWage;
    }

    public void setOvertimeWage(double otpay){
        this.overtimeWage = otpay;
    }

    @Override
    public String toString() {
        return "Technician{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", yearJoined=" + yearJoined +
                ", employed=" + employed +
                ", hourlyWage=" + hourlyWage +
                ", overtimeWage=" + overtimeWage +
                '}';
    }
}