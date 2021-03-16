package lesson11;

import java.util.Arrays;

public class Pizza {
    private Toppings[] toppings;
    private CrustType crust;
    private CrustSize size;


    public Pizza(Toppings[] toppings, CrustType crust, CrustSize size) {
        this.toppings = toppings;
        this.crust = crust;
        this.size = size;
    }

    public Toppings[] getToppings() {
        return toppings;
    }

    public CrustType getCrust() {
        return crust;
    }

    public CrustSize getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Pizza with " +
                "toppings of " + Arrays.toString(toppings) +
                " with a " + crust + " and " + size + " size. " ;

    }
}

