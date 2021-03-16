package lesson3_13_21;

public class School {
    private String name;
    private SchoolType type;
    private SchoolAge ageRange;
    private Address address;

    public School(String name, SchoolType type, SchoolAge ageRange, Address address) {
        this.name = name;
        this.type = type;
        this.ageRange = ageRange;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public SchoolType getType() {
        return type;
    }

    public SchoolAge getAgeRange() {
        return ageRange;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", ageRange=" + ageRange +
                ", address=" + address +
                '}';
    }
}
