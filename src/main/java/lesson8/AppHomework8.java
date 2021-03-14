package lesson8;

public class AppHomework8 {

// 1. Create 4 classes with fields (at least 3 fields) and methods (at least 1 method)
//    each class has at least 2 constructors (default and full)
//    create printClass()/ printInfo() method to print out all fields
//    fields are private
//    each field has getter and setter
//2. In the App class create main() and create 2 instances of each class;
//    one instance created used default constructor - fill up fields using setter
//    second object created using full constructor
//    print object info using print-out method


        public static void main(String[] args) {
            Dog maltese = new Dog();
            maltese.setBreed("Maltese");
            maltese.setAge(2);
            maltese.setWeight(18);
            maltese.printDogInfo();

            Dog bulldog = new Dog ("Bulldog", 8, 55);
            bulldog.sleep(10);

            Automobile stationWagon= new Automobile();
            stationWagon.setType("Station Wagon");
            stationWagon.setYear(1999);
            stationWagon.setCylinders(6);
            stationWagon.printAutomobileInfo();

            Automobile pickUp = new Automobile("Pick up", 8, 2020);
            pickUp.warranty(10);

            SportsTeam mavericks = new SportsTeam();
            mavericks.setName("Mavericks");
            mavericks.setPlayers(12);
            mavericks.setCaptain("Cuban");
            mavericks.printTeamInfo();

            SportsTeam bulls = new SportsTeam("Bulls", 12, "Jordan");
            bulls.Wins(82);
            bulls.printTeamInfo();


        }


    }




