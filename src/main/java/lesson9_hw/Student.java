package lesson9_hw;

public class Student {
    private String name;
    private String lastName;
    private int age;
    private int grade;

    public Student(String name, String lastName, int age, int grade) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.grade=grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String l) {
        lastName = l;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';

    }
}



