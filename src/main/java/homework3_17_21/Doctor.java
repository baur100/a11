package homework3_17_21;

public class Doctor {
    private String name;
    private String lastName;
    private Position position;

    public Doctor() {
    }

    public void printDoctors(String name, String lastName, Position position) {
        System.out.println("Doctor:" + name + " " + lastName + ". Position: " + position + ".");
    }
}
