package homework3_10;

public class AppClothing {
    public static void main(String[] args) {
        Clothing pants = new Clothing();

        pants.setGender("Men");
        pants.setType("Pants");
        pants.setBrand("Calvin Klein");
        pants.setSeller("Amazon");
        pants.setSize2(32);
        pants.setPrice(19.99);


        System.out.println(pants.getGender());
        System.out.println(pants.getType());
        System.out.println(pants.getBrand());
        System.out.println(pants.getSeller());
        System.out.println(pants.getSize2());
        System.out.println(pants.getPrice());

        Clothing shirts= new Clothing("Men","Shirts","Hugo Boss","Macys","M",19.99);

        System.out.println(shirts.getGender());
        System.out.println(shirts.getType());
        System.out.println(shirts.getBrand());
        System.out.println(shirts.getSeller());
        System.out.println(shirts.getSize1());
        System.out.println(shirts.getPrice());

        pants.soldout(15);
        shirts.soldout(20);
    }
}


