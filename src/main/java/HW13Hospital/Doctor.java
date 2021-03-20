package HW13Hospital;

public class Doctor {
    private String name;
    private String lastName;
    private Title title;

    public Doctor(String name, String lastName, Title title) {
        this.name = name;
        this.lastName = lastName;
        this.title = title;
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

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title=" + title +
                '}';
    }
    public String printDoctors(){
        return "Name: "+ name + "\n" +
                "Last Name: " + lastName + "\n" +
                "Title: " + title;
    }

}
