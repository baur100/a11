package lesson11;

public class Address {
    private String street1;
    private String city;
    private States state;
    private String zip;

    public Address(String street1, String city, States state, String zip) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zip = zip;
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

    public String getZip() {
        return zip;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                ", city='" + city + '\'' +
                ", state=" + state +
                ", zip='" + zip + '\'' +
                '}';
    }
}
