package hw8;

public class App {
    public static void main(String[] args) {
        Clothes jeans = new Clothes();
        jeans.brandName = "Levis";
        jeans.color = "Blue";
        jeans.size = 32;
        jeans.price = 49.99;
        jeans.storePurchased = "Dillards";

        Clothes sweater = new Clothes();
        sweater.brandName = "Polo";
        sweater.color = "Grey";
        sweater.size = 30;
        sweater.price = 35.99;

        College uk = new College();
        uk.name = "University of Kentucky";
        uk.state = "Kentucky";
        uk.yearStart = 2010;
        uk.yearGraduate = 2014;
        uk.tuition = 80945;
        uk.mascot = "Wild Cat";
        uk.major = "Economics";

        College ut = new College();
        ut.name = "University of Tennessee";
        ut.state = "Tennessee";
        ut.yearStart = 2002;
        ut.yearGraduate= 2006;
        ut.tuition = 140000.50;
        ut.mascot = "Volunteer Hound";
        ut.major = "Computer Science";

        Music rock = new Music();
        rock.artist = "Tool";
        rock.albumTitle = "10000 Days";
        rock.recordCompany = "Virgin Records";
        rock.numRecordsSold = 5000000;
        rock.awardsEarned = 20;

        Music st = new Music();
        st.artist = "Hans Zimmer";
        st.albumTitle = "Intersteller";
        st.recordCompany = "Water Tower";
        st.numRecordsSold = 3000000;
        st.awardsEarned = 5;

        Wine red = new Wine();
        red.name = "Pinot Noir";
        red.vineyard = "Apothica";
        red.year = 2020;
        red.price = 30;

        Wine pink = new Wine();
        pink.name = "White Zinfandel";
        pink.vineyard = "Beringer Main & Vine";
        pink.year = 2021;
        pink.price = 10;

        String style = jeans.getStyle();
        System.out.println(style);
        String store = jeans.getStore();
        System.out.println(store);
        double price = jeans.getPrice();
        System.out.println(price);

        String style1 = sweater.getStyle();
        System.out.println(style1);
        String store1 = sweater.getStore();
        System.out.println(store1);
        double price1 = sweater.getPrice();
        System.out.println(price1);

        String first = ut.getFirstChoice();
        System.out.println(first);
        String major = ut.getMajor();
        System.out.println(major);
        String details = ut.getDetails();
        System.out.println(details);
        String mascot = ut.getMascot();
        System.out.println(mascot);

        String first1 = uk.getFirstChoice();
        System.out.println(first1);
        String major1 = uk.getMajor();
        System.out.println(major1);
        String details1 = uk.getDetails();
        System.out.println(details1);
        String mascot1 = uk.getMascot();
        System.out.println(mascot1);

        String favorite = rock.getFavoriteMusic();
        System.out.println(favorite);
        int recordsSold = rock.getNumRecordsSold();
        System.out.println(recordsSold);
        String production = rock.getProduction();
        System.out.println(production);

        String favorite1 = st.getFavoriteMusic();
        System.out.println(favorite1);
        int recordsSold1 = st.getNumRecordsSold();
        System.out.println(recordsSold1);
        String production1 = st.getProduction();
        System.out.println(production1);

        String type = red.getWineType();
        System.out.println(type);

        String type1 = pink.getWineType();
        System.out.println(type1);
    }
}
