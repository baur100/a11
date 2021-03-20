package HW13;

public class Class1 {
    private int index;

    public Class1(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Class1{" +
                "count=" + index +
                '}';
    }
}
