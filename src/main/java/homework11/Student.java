package homework11;

import java.util.Arrays;

public class Student {
    private String name;
    private Subjects[] subjects;
    private Standings year;

    public Student(String name, Subjects[] subjects, Standings year){
        this.name = name;
        this.subjects = subjects;
        this.year = year;
    }

    public Student(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Subjects[] getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects[] subjects) {
        this.subjects = subjects;
    }

    public Standings getYear(){
        return year;
    }

    public void setYear(Standings year){
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subjects=" + Arrays.toString(subjects) +
                ", School year='" + year + '\'' +
                '}';
    }
}
