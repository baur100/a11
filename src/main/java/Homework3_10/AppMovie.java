package Homework3_10;

public class AppMovie {
    public static void main(String[] args) {
        Movie onDemand=new Movie();

        onDemand.setName("Shrek");
        onDemand.setDirectors("Andrew Adamson");
        onDemand.setDirectors("Vicky Jenson");
        onDemand.setGenres("Kids & Family");
        onDemand.setFormats("4K");
        onDemand.setYearOfRelease(2001);

        System.out.println(onDemand.getName());
        System.out.println(onDemand.getDirectors());
        System.out.println(onDemand.getDirectors());
        System.out.println(onDemand.getGenres());
        System.out.println(onDemand.getFormats());
        System.out.println(onDemand.getYearOfRelease());

        Movie forRent = new Movie("The Terminator","James Cameron","Action","Blu-ray",1984);

        System.out.println(forRent.getName());
        System.out.println(forRent.getDirectors());
        System.out.println(forRent.getGenres());
        System.out.println(forRent.getFormats());
        System.out.println(forRent.getYearOfRelease());

        forRent.buget(6);

    }
}
