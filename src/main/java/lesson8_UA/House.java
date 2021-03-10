package lesson8_UA;

public class House {
    public String address;
    public String city;
    public String state;
    public int zipCode;
    public int yearOfBuilt;
    public int bedrooms;
    public int bathrooms;
    public double footage;
    public boolean sellByOwner;
    public int price;

    public String getAddress(){
        return ("Street address: " + address + "\n" + "City: " + city + "\n" + "State: " + state + "\n" + "Zip Cod: " + zipCode);
    }

    public String getHouseInfo(){
        return ("Bedrooms: " + bedrooms + "\nBathrooms: " + bathrooms + "\nFootage: " + footage + "\nYear: "+ yearOfBuilt);
    }

    public double getSellingInfo(){
        if(sellByOwner){
            return price;
        }
        else return price*1.06;
    }
}

