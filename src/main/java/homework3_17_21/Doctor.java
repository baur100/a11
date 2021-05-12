package homework3_17_21;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;


    public Doctor(String name, String lastName, Position position) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Position getPosition() {
        return position;
    }

    public String toString() {
        return ("Doctor:" + name + " " + lastName + ". Position: " + position + ".");
    }
}