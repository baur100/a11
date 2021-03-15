package lesson11_UA;

public class Address {
    private String street1;
    private String city;
    private States state;
    private String zipCode;

    public Address(String street1, String city, States state, String zipCode) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public String getStreet1() {
        return street1;
    }

    public String getCity() {
        return city;
    }

    public States getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
