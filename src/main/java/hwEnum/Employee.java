package hwEnum;

public class Employee extends Worker {
    private String job;
    private int yearsWorked;

    public Employee(String name, String lastname, int year, String job, int yearsWorked) {
        super(name,lastname,year);
        this.job = job;
        this.yearsWorked = yearsWorked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
