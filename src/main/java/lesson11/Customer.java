package lesson11;

public class Customer {
    private String name;
    private int account;

    public Customer(String name, int account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Customer's " +
                "name is " + name  +
                " and their account is: " + account;
    }
}
