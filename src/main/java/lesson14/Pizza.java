package lesson14;


public class Pizza {
    private int toppings;
    private String size;


    public Pizza(int toppings, String size) {
        this.toppings = toppings;
        this.size = size;
    }

    public int getToppings() {
        return toppings;
    }

    public void setToppings(int toppings) {
        this.toppings = toppings;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                ", size='" + size + '\'' +
                '}';
    }
}

