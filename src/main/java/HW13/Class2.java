package HW13;

public class Class2 {
    private String count;

    public Class2(String count) {
        this.count = count;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Class2{" +
                "color='" + count + '\'' +
                '}';
    }
}
