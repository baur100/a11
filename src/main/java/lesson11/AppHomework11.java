package lesson11;


public class AppHomework11 {
    public static void main(String[] args) {

        Toppings[] orderToppings = {Toppings.PEPPERONI, Toppings.CHEESE, Toppings.MUSHROOMS};
        Customer orderCustomer = new Customer("Harry", 404911);

        Pizza orderPizza = new Pizza(orderToppings, CrustType.THICK_CRUST,CrustSize.SMALL);
        Order newOrder = new Order(orderPizza, orderCustomer);

        System.out.println(newOrder.toString());




    }

}
