package hw10SuperClass;

public class Banana extends Fruit{
    private String banana;

    public Banana(String banana, String shape, String taste, boolean nut) {
        super(shape, taste, nut);
        this.banana = banana;
    }

    public String getBanana() {
        return banana;
    }

    public void setBanana(String banana) {
        this.banana = banana;
    }

    @Override
    public String toString() {
        return "Banana{" +
                "banana='" + banana + '\'' +
                ", shape='" + shape + '\'' +
                ", taste='" + taste + '\'' +
                ", nut=" + nut +
                '}';
    }
}
