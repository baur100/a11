package lesson10_hw;

public class Student {
    private String name;
    private String LastName;
    private int age;
    private int grade;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public Student(String name, String lastName, int age, int grade) {
        this.name = name;
        LastName = lastName;
        this.age = age;
        this.grade = grade;


    }
}
