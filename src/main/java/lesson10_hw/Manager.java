package lesson10_hw;

public class Manager {
    protected String Name;
    protected String LastName;
    protected int age;
    protected  int yearOfExperience;

    public Manager(String name, String lastName , int age, int yearOfExperience) {
        this.Name = name;
        this.LastName = lastName;
        this.age = age;
        this.yearOfExperience=yearOfExperience;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfExperience() {
        return yearOfExperience;
    }

    public void setYearOfExperience(int yearOfExperience) {
        this.yearOfExperience = yearOfExperience;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", yearOfExperience=" + yearOfExperience +
                '}';

    }
}



