package hw10SuperClass;

public class Pear extends Fruit {
    private String pear;

    public Pear(String pear, String shape, String taste, boolean nut) {
        super(shape, taste, nut);
        this.pear = pear;
    }

    public String getPear() {
        return pear;
    }

    public void setPear(String pear) {
        this.pear = pear;
    }

    @Override
    public String toString() {
        return "Pear{" +
                "shape='" + shape + '\'' +
                ", taste='" + taste + '\'' +
                ", nut=" + nut +
                ", pear='" + pear + '\'' +
                '}';
    }
}
