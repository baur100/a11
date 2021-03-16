package homework9;

public class Employee {
    private String name;
    private String title;
    private String startDate;
    private boolean employeed;

    public Employee(String name, String title, String startDate, boolean employeed){
        this.name = name;
        this.title = title;
        this.startDate = startDate;
        this.employeed = employeed;
    }

    public Employee(){}

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getStartDate(){
        return this.startDate;
    }

    public void setStartDate(String startDate){
        this.startDate = startDate;
    }

    public boolean getEmployed(){
        return this.employeed;
    }

    public void setEmployeed(boolean employeed){
        this.employeed = employeed;
    }

    public void printInfo(){
        System.out.println(name + " is a(n) " + title + " started on " + startDate);
        System.out.println("Currently employeed? " + employeed);
    }
}
