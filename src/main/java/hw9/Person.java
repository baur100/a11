package hw9;

public class Person {
    private String name;
    private String lastName;
    private int yearOfBirth;

    public Person(String name, String lastName, int yearOfBirth) {
        this.name = name;
        this.lastName = lastName;
        this.yearOfBirth = yearOfBirth;
    }
    public Person(){
        String name;
        String lastName;
        int yearOfBirth;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    String returnPerson (String name, String lastName, int yearOfBirth){
        String personParameters;
        personParameters = "Name: " + name + "\nLast Name: " + lastName+"\nYear of Birth: " +yearOfBirth;
        return personParameters;
    }
    public void hello(){
        System.out.println(name + " " + lastName+" born in: "+yearOfBirth);
    }
}
