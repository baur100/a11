package lesson8_UA;

public class House {
    public int zip;
    public String address;
    public String city;
    public String state;
    public int yearOfBuilt;
    public int bedrooms;
    public int bathrooms;
    public int footage;
    //public int footage;
    //public int footage;


    public String getAddress(){
        return "Street address: " + address + "\n" + "City: " + city + "\nState: " + state + "zip: "+zip;
    }

    public String getHouseInfo() {
        return "Bedrooms: " + bedrooms + "\nBathrooms: " + bathrooms + "\nFootage: " + footage + "\nYear: " + yearOfBuilt;

    }

}
