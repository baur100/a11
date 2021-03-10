package hw8;

public class HomeWork2 {
    public static void main(String[] args) {

        int a = 100;
        int x = 12;
        int d = 12;
        int c = 122;

        boolean one = a == d;
        boolean two = x == d;
        boolean three = c >= a;
        boolean four = x >= d;
        boolean five = (d == c) || (x == d);
        boolean six = (c > x) && (d >= x);
        boolean seven = (a > x) || (a > c);
        boolean eight = (a == c) && (d == c);
        boolean nine = (c == c) && (a >= a);
        boolean ten = (c > c) || (a <= a);
        boolean eleven = (x > a) && (c == d);
        boolean twelve = (c > a) && (x > d);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);
        System.out.println(five);
        System.out.println(six);
        System.out.println(seven);
        System.out.println(eight);
        System.out.println(nine);
        System.out.println(ten);
        System.out.println(eleven);
        System.out.println(twelve);

        int carWeight = 1000;
        double gallonsPerMile = 32.5;
        boolean isEfficient = (carWeight / gallonsPerMile) < 30;

        if (isEfficient) {
            System.out.println("Your car is efficient!");
        } else {
            System.out.println("Your car is not efficient!");
        }

        int priceOfTeaInChina = 50;

        boolean doesItHaveToDoWith = priceOfTeaInChina >= 25;

        if (doesItHaveToDoWith) {
            System.out.println("These two are related!");
        } else {
            System.out.println("These two have nothing to do with each other!");
        }

        int driversAge = 16;
        boolean isOldEnough = driversAge >= 16;

        if (isOldEnough) {
            System.out.println("You can drive!");
        } else {
            System.out.println("You cannot drive!");
        }
    }
}
