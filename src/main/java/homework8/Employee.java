package homework8;

public class Employee {
    public String name;
    public String title;
    public String startDate;
    public boolean isEmployeed;

    public void employeeInfo(){
        System.out.println(name + " was hired on " + startDate + " as " + title + ".");
    }

    public void currentStatus(){
        System.out.println("Is " + name + " currently employeed? " + isEmployeed);
    }
}
