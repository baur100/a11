package lesson8_UA;

public class AppHouse {
    public static void main(String[] args) {
        House forSell = new House();
        forSell.zip = 93551;
        forSell.state = "CA";
        forSell.address = "54 Elm Street";
        forSell.city = "Gotham";
        forSell.yearOfBuilt = 1945;
        //forSell.footage = 200.23;


        String address = forSell.getAddress();
        System.out.println(address);


    }
}
