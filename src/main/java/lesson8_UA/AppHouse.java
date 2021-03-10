package lesson8_UA;

public class AppHouse {
    public static void main(String[] args) {
        House forSell = new House();
        forSell.zipCode = 93551;
        forSell.state = "California";
        forSell.address = "54 Elm Street";
        forSell.city = "Gotham";
        forSell.yearOfBuilt = 1945;
        forSell.footage = 2000.23;
        forSell.bathrooms = 3;
        forSell.bedrooms = 3;
        forSell.sellByOwner = true;
        forSell.price = 500000;

        String address = forSell.getAddress();
        System.out.println(address);

        System.out.println(forSell.getHouseInfo());
        System.out.println(forSell.getSellingInfo());
    }
}
