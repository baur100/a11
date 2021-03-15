package lesson10;

public class Doctor{
    private String hospital_name;
    private int salary;
    private int patients;



    public Doctor() { ;
    }

    public Doctor(String hospital_name, int salary, int patients) {
        this.hospital_name = hospital_name;
        this.salary = salary;
        this.patients = patients;
    }


    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getPatients() {
        return patients;
    }

    public void setPatients(int patients) {
        this.patients = patients;
    }

    @Override
    public String toString() {
        return "Doctor works in a " + "hospital called " + hospital_name + " and his salary is " + salary +
                ", and the hospital has " + patients + " patients ";

    }
}
