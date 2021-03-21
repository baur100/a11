package lesson14;

public class Customer {

    int account;
    String name;

    public Customer(int account, String name) {
        this.account = account;
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "account=" + account +
                ", name='" + name + '\'' +
                '}';
    }
}
