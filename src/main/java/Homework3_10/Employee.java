package Homework3_10;

public class Employee {
    private String name;
    private String lastname;
    private String position;
    private String dateOfBirthday;
    private int yearOfStart;

    public String getEmployeeInfo(){
        return "Employee: "+"\nName: "+name+"\nLast name: "+lastname+"\nPosition: "+position+"\nDate of Birthday: "+dateOfBirthday+"\nYear of the job start: "+yearOfStart;
    }

    public Employee(String name,String lastname,String position,String dateOfBirthday,int yearOfStart){
        this.name=name;
        this.lastname=lastname;
        this.position=position;
        this.dateOfBirthday=dateOfBirthday;
        this.yearOfStart=yearOfStart;
    }
    public Employee(){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public String getPosition(){
        return position;
    }
    public void setPosition(String position){
        this.position=position;
    }
    public String getDateOfBirthday(){
        return dateOfBirthday;
    }
    public void setDateOfBirthday(String dateOfBirthday){
        this.dateOfBirthday=dateOfBirthday;
    }
    public int getYearOfStart(){
        return yearOfStart;
    }
    public void setYearOfStart(int yearOfStart){
        this.yearOfStart=yearOfStart;
    }
}
