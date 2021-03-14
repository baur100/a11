package hw10SuperClass;

public class Fruit{

    protected String shape;
    protected String taste;
    protected boolean nut;

    public Fruit(String shape, String taste, boolean nut){
        this.shape = shape;
        this.taste = taste;
        this.nut = nut;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public boolean isNut() {
        return nut;
    }

    public void setNut(boolean nut) {
        this.nut = nut;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "shape='" + shape + '\'' +
                ", taste='" + taste + '\'' +
                ", nut=" + nut +
                '}';
    }
}
