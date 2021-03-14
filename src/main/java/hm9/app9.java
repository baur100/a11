package hm9;

public class app9 {
    public static void main(String[] args) {
    Bed myBed = new Bed("MyBed", "metal frame", "king");
        Bed bigBed = new Bed();
        bigBed.setName("Big Bed");
        bigBed.setType("wood frame");
        bigBed.setSize("twin");

        System.out.println(bigBed.printInfo());
        System.out.println(bigBed.printClass());

        System.out.println(myBed.printInfo());
        System.out.println(myBed.printClass());


        CellPhone myPhone = new CellPhone("14", "Android 20", 1,3, true);

        CellPhone iphone = new CellPhone("ios", 12, true);

        System.out.println(myPhone.printClass(true));
        System.out.println(myPhone.printClass(false));

        System.out.println(iphone.printInfo(true));
        System.out.println(iphone.printInfo(false));

        Table myTable = new Table();
        myTable.setName("Green Table");
        myTable.setSize("Basic");
        myTable.setType("Wood");

        System.out.println(myTable.printClass());

        Table bossTable = new Table("Boss", "Big boss table", "wood");

        System.out.println(bossTable.printInfo());

        Vehicle myCar = new Vehicle("Mercedes-benz","E350");
        Vehicle sportCar = new Vehicle("BMW", "M5", 2021);

        System.out.println(myCar.printInfo());
        System.out.println(sportCar.printInfo());
    }

}
