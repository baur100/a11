package homework9;

public class App {
    public static void main(String[] args){
        Pet dog = new Pet("Mitch", "German Shepherd", 65);
        Pet cat = new Pet();
        cat.setName("Tracy");
        cat.setBreed("Domestic Shorthair");
        cat.setWeight(10.0);

        Song song1 = new Song("Sounds of Silence", "Simon & Garfunkel", "Wednesday Morning, 3 A.M.", 6, 3.08);
        Song song2 = new Song();
        song2.setName("Dancing Queen");
        song2.setArtist("ABBA");
        song2.setAlbum("Arrival");
        song2.setTrack(2);
        song2.setLength(3.50);

        Employee employee1 = new Employee("John Doe", "Software Engineer II", "2/1/2020", true);
        Employee employee2 = new Employee();
        employee2.setName("Mary Tumi");
        employee2.setTitle("Senior Manager");
        employee2.setStartDate("12/31/2018");
        employee2.setEmployeed(false);

        Smartphone phone1 = new Smartphone("iPhone 8", 4.7, 1821, false);
        Smartphone phone2 = new Smartphone();
        phone2.setModel("Galaxy S8");
        phone2.setSize(5.8);
        phone2.setBattery(3000);
        phone2.setMemoryCard(true);

        dog.printInfo();
        cat.printInfo();
        song1.printInfo();
        song2.printInfo();
        employee1.printInfo();
        employee2.printInfo();
        phone1.printInfo();
        phone2.printInfo();
        }
}
