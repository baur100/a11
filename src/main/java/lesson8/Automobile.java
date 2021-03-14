package lesson8;

public class Automobile {
    private String type;
    private int cylinders;
    private int year;


    // full constructor
    public Automobile(String type, int cylinders, int year ){
        this.type=type;
        this.cylinders=cylinders;
        this.year=year;
    }

    // default constructor
    public Automobile( ){ }


    // getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    // methods

    public void warranty(int num){
        System.out.println("This automobile has " + num + " years of warranty");
    }

    public void printAutomobileInfo(){

        System.out.println("The type of the automobile is " + type);
        System.out.println("The automobile has " + cylinders + " cylinders");
        System.out.println("The year of the automobile is " + year);
    }


}

