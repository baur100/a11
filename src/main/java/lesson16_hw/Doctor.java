package lesson16_hw;

public class Doctor {
    private String name;
    private String lastName;
    private int room;

    public Doctor(String name, String lastName, int room) {
        this.name = name;
        this.lastName = lastName;
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getRoom() {
        return room;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
