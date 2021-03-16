package lesson3_12_21;

public class Teacher extends Person{
    private String subject;

    public Teacher(String name,String lastName,int year,String subject){
        super(name,lastName,year);
        this.subject=subject;
    }


    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", lastname='" + lastName + '\'' +
                ", year=" + year +
                ", subject='" + subject + '\'' +
                '}';
    }
}
