package HM8;

public class app {
    public static void main(String[] args){
        Room forRent = new Room();
        forRent.footage = 256;
        forRent.color = "White";
        forRent.numberOrRooms = 4;

        Room forRentBlack = new Room();
        forRentBlack.footage = 23569;
        forRentBlack.color = "Black";
        forRentBlack.numberOrRooms = 2;

        System.out.println(new StringBuilder().append("Numbers ot the room: ").append(forRent.numberOrRooms).append(", sqft: ").append(forRent.getFootage(forRent.footage)).append(", Color of the room: ").append(forRent.color).append("").toString());
        System.out.println(new StringBuilder().append("Numbers ot the room: ").append(forRentBlack.numberOrRooms).append(", sqft: ").append(forRentBlack.getFootage(forRentBlack.footage)).append(", Color of the room: ").append(forRentBlack.color).append("").toString());

        Car forSale = new Car();
        forSale.engine = false;
        forSale.run = "run";
        forSale.off = "off";
        forSale.make = "Toyota";
        forSale.model = "Supra";
        forSale.body = "Coupe";
        forSale.year = 2021;

        Car forSaleSubaru = new Car();
        forSaleSubaru.engine = true;
        forSaleSubaru.run = "run";
        forSaleSubaru.off = "off";
        forSaleSubaru.make = "Subaru";
        forSaleSubaru.model = "Forester";
        forSaleSubaru.body = "SUV";
        forSaleSubaru.year = 2021;

        System.out.println(forSale.typeOfTheCar() + forSale.statusOfEng());
        System.out.println(forSaleSubaru.typeOfTheCar() + forSaleSubaru.statusOfEng());


        Player startPlay = new Player();
        startPlay.health = true;
        startPlay.life = 0;
        startPlay.dead = "Dead";
        startPlay.alive = "Alive";
        startPlay.name = "First";

        Player continuePlay = new Player();
        continuePlay.health = false;
        continuePlay.life = 1;
        continuePlay.dead = "Dead";
        continuePlay.alive = "Alive";
        continuePlay.name = "Second";

        System.out.println(startPlay.descriptionOfPlayer());
        System.out.println(continuePlay.descriptionOfPlayer());

        Bed myBed = new Bed();
        myBed.name = "My bed";
        myBed.size = "King";
        myBed.frame = "metal frame";
        myBed.mattress = false;

        System.out.println(myBed.getBed() + myBed.getMattress());

        Bed catBed = new Bed();
        catBed.name = "Cat's bed";
        catBed.size = "King";
        catBed.frame = "Rug";
        catBed.mattress = true;

        System.out.println(catBed.getBed() + catBed.getMattress());

    }
}
