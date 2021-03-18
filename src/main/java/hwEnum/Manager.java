package hwEnum;

public class Manager extends Worker {
    private String department;
    private int salary;

    public Manager(String name, String lastname, int year, String department, int salary) {
        super(name, lastname, year);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
