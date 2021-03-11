package homework8;

public class App {
    public static void main(String[] args){
        Pet mitch = new Pet();
        mitch.name = "Mitch";
        mitch.breed = "German Shepherd";
        mitch.gender = "male";
        mitch.weight = 65;

        Pet tracy = new Pet();
        tracy.name = "Tracy";
        tracy.breed = "Domestic Shorthair";
        tracy.gender = "female";
        tracy.weight = 10;

        Song song1 = new Song();
        song1.name = "The Sounds of Silence";
        song1.artist = "Simon & Garfunkel";
        song1.album = "Wednesday Morning, 3 A.M.";
        song1.track = 6;

        Song song2 = new Song();
        song2.name = "Dancing Queen";
        song2.artist = "ABBA";
        song2.album = "Arrival";
        song2.track = 2;

        Employee john = new Employee();
        john.name = "John Doe";
        john.title = "Software Engineer II";
        john.startDate = "2/1/2020";
        john.isEmployeed = true;

        Employee mary = new Employee();
        mary.name = "Mary Tumi";
        mary.title = "Senior Manager";
        mary.startDate = "12/31/2018";
        mary.isEmployeed = false;

        Smartphone phone1 = new Smartphone();
        phone1.model = "iPhone 8";
        phone1.screenSize = 4.7;
        phone1.batterySize = 1821;
        phone1.hasCardSlot = false;

        Smartphone phone2 = new Smartphone();
        phone2.model = "Galaxy S8";
        phone2.screenSize = 5.8;
        phone2.batterySize = 3000;
        phone2.hasCardSlot = true;

        mitch.appointment("3-13-2021");
        mitch.petInfo();
        tracy.appointment("3-14-2021");
        tracy.petInfo();

        song1.nowPlaying();
        song1.songInfo();
        song2.nowPlaying();
        song2.songInfo();

        john.employeeInfo();
        john.currentStatus();
        mary.employeeInfo();
        mary.currentStatus();

        phone1.phoneInfo();
        phone1.memoryExtension();
        phone2.phoneInfo();
        phone2.memoryExtension();
    }
}
