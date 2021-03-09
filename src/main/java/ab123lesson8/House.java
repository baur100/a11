package ab123lesson8;

public class House {
    public int zip;
    public String address;
    public String city;
    public String state;
    public int yearOfBuild;
    public int bedrooms;
    public int bathrooms;
    public double footage;
    public boolean sellByOwner;
    public boolean isBasement;
    public int price;

    public String getAddress(){
        return "Street adress: " +address+"\nCity: "+ city+ "\nState: "+state+",  zip: " + zip;
    }

    public String getHouseInfo(){
        return "Bedrooms: "+ bedrooms+"\nBathrooms: " +bathrooms+"\nFootage: " +footage+ "\nYear: "+ yearOfBuild;
    }

    public double getSellingInfo(){
        if(sellByOwner){
            return price;
        }
        return price*1.06;
    }
}
