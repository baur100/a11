package lesson8;

public class App1 {
    public static void main(String[] args) {
        House forSell = new House();
        forSell.zip=33401;
        forSell.state = "FL";
        forSell.address = "54 Elm street";
        forSell.city = "Gotham";
        forSell.yearOfBuild=1945;
        forSell.footage=200.23;
        forSell.bathrooms=3;
        forSell.bedrooms=3;
        forSell.sellByOwner=false;
        forSell.price=500000;

        String address = forSell.getAddress();
        System.out.println(address);

        System.out.println(forSell.getHouseInfo());
        System.out.println(forSell.getSellingInfo());
    }
}
