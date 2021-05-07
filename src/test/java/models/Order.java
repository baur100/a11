package models;

import enums.OrderStatus;

public class Order {

    private int id;
    private int petId;
    private int quantity;
    private OrderStatus status;
    private boolean complete;

    public Order(int id, int petId, int quantity, OrderStatus status,boolean complete) {
        this.id = id;
        this.petId = petId;
        this.quantity = quantity;
        this.status = status;
        this.complete=complete;
    }

    public int getId(){
        return id;
    }

    public int getPetId(){
        return petId;
    }
    public int getQuantity(){
        return quantity;
    }
    public OrderStatus getStatus() {
        return status;
    }

}
