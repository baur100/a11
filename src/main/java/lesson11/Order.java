package lesson11;

public class Order {
    private Pizza pizza;
    private Customer customer;

    public Order(Pizza pizza, Customer customer) {
        this.pizza = pizza;
        this.customer = customer;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "The new order was: "
                + pizza
                + customer ;

    }
}
