package hw10SuperClass;

public class Apple extends Fruit{
    public String apple;

    public Apple(String apple, String shape, String taste, boolean nut) {
        super(shape, taste, nut);
        this.apple = apple;
    }

    public String getApple() {
        return apple;
    }

    public void setApple(String apple) {
        this.apple = apple;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "apple='" + apple + '\'' +
                ", shape='" + shape + '\'' +
                ", taste='" + taste + '\'' +
                ", nut=" + nut +
                '}';
    }
}
