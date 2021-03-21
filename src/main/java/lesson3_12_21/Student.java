package lesson3_12_21;

import java.sql.Array;
import java.util.Arrays;

public class Student extends  Person{
    private String major;
    private String[] subjects;

    public Student(String name,String lastName,int year,String major,String[] subjects){
        super(name,lastName,year);
        this.major=major;
        this.subjects=subjects;
    }
//    public Student(){}

    public String getMajor(){
        return major;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public void setSubjects(String[] subjects){
        this.subjects=subjects;
    }
    public String[] getSubjects(){
        return subjects;
    }

    public String toString(){
        return "Student{"+"name='"+name+'\''+", lastName='"+lastName+'\''+", year="+year+", major='"+major+'\''+",subjects="+ Arrays.toString(subjects)+'}';
    }
}
