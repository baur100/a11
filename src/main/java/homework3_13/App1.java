package homework3_13;

public class App1 {
    public static void main(String[] args) {
        Microwave panasonic = new Microwave("Panasonic", "NN-SN65KB", "Black", 1.2, 1200, 1200, 189.99);
        Microwave blackdecker = new Microwave("Black+Decker", "Digital Microwave", "Stainless Steel", 0.9, 900, 900, 89.99);
        System.out.println(panasonic);
        System.out.println(blackdecker);

        Dishwasher frigidaire = new Dishwasher("Built in Dishwasher", "FRIGIDAIRE", "FGID2468UD", "Stainless Steel", 14, 49, 3, 499.99);
        Dishwasher danby = new Dishwasher("Countertop Dishwasher", "Danby", "DDW621WDB", "White", 11.7, 52, 6, 259.99);
        System.out.println(frigidaire);
        System.out.println(danby);

        Refrigerator samsung = new Refrigerator("Samsung", "RF28T5001SR", "Steel", 28, 3, 1708.00);
        Refrigerator frigidaire1 = new Refrigerator("Frigidaire", "FFHT1425VV", "White", 13.9, 2, 599.99);
        System.out.println(samsung);
        System.out.println(frigidaire1);


        HomeImprovement drill = new HomeImprovement("Drill", TypeDrill.Driver, CordStyle.CORDLESS);
        System.out.println(drill);

        Mattress mymattress = new Mattress("Linespa", "Plash", mattressSize.QUEEN);
        System.out.println(mymattress);


        AmericanShoesSize mySlippers = new Slippers("Moccasin", "Hanes", "Brown", 11,24.99);
        AmericanShoesSize sonSlippers= new Slippers("Slide","LongBay","Blue",9.5,19.99);

        AmericanShoesSize sneackersRun = new Sneakers("Running","ADIDAS","White",11,54.99);
        AmericanShoesSize sneackersWalk = new Sneakers("Walking","New Balance","Black",10.5,65.99);
        mySlippers.useAmericanSize();
        sneackersRun.useAmericanSize();
        System.out.println(mySlippers);
    }
}
