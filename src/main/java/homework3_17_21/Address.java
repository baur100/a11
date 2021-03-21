package homework3_17_21;

public class Address {
    private String street;
    private String town;
    private String state;
    private int zipcode;

    public Address(){}

    public Address(String street,String town,String state,int zipcode){
        this.street=street;
        this.town=town;
        this.state=state;
        this.zipcode=zipcode;
    }

    @Override
    public String toString() {
        return "Hospital Address-" +
                "street:'" + street + '\'' +
                ", town:'" + town + '\'' +
                ", state:'" + state + '\'' +
                ", zipcode:" + zipcode +
                '}';
    }
}
