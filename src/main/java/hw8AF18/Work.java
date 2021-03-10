package hw8AF18;

public class Work {
    public static void main(String[] args) {
        //Chairs
        Chair chr1 = new Chair();
        chr1.model = "Gold.500";
        chr1.material = "Lather";
        chr1.price = 777;

        Chair chr2 = new Chair();
        chr2.model = "Budget.100";
        chr2.material = "Fabric";
        chr2.price = 180;

        chr1.infoChair();
        chr1.getPriceWithDiscount(0.2);

        System.out.println("--------------------------------");

        chr2.infoChair();
        chr2.getPriceWithDiscount(0.1);

        //Sofas
        Sofa sf1 = new Sofa();
        sf1.model = "Gold.500";
        sf1.sections = 5;
        sf1.shape = "Random";
        sf1.price = 2650;

        Sofa sf2 = new Sofa();
        sf1.model = "Budget.100";
        sf1.sections = 2;
        sf2.shape = "L-shape";
        sf2.price = 899;

        sf1.infoSofa();
        sf1.getType();

        System.out.println("--------------------------------");

        sf2.infoSofa();
        sf2.getType();

        //Tables

        Table tbl1 = new Table();
        tbl1.model = "Silver.300";
        tbl1.type = "Transformer";
        tbl1.feature = "Glass shelves";
        tbl1.price = 450;

        Table tbl2 = new Table();
        tbl2.model = "Cedar";
        tbl2.type = "Coffee";
        tbl2.feature = "Real solid wood";
        tbl2.price = 430;

        tbl1.infoTable();
        tbl1.bestMatch("dinning room");

        System.out.println("--------------------------------");

        tbl2.infoTable();
        tbl2.bestMatch("hall");

        //TVs

        Tv tv1 = new Tv();
        tv1.brand = "Samsung";
        tv1.model = "UHD 1000";
        tv1.diagonal = 65;
        tv1.frame = 0.8;

        Tv tv2 = new Tv();
        tv2.brand = "Sony";
        tv2.model = "Bravia 5000";
        tv2.diagonal = 70;
        tv2.frame = 0.3;


        tv1.infoTv();
        tv1.widthTv();

        System.out.println("--------------------------------");

        tv2.infoTv();
        tv2.widthTv();


    }
}
