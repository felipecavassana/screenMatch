package DesafioS03.model;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private double limit;
    private List<Order> orders;

    public CreditCard(double limit) {
        this.limit = limit;
        this.orders = new ArrayList<>();
    }

    public double getLimit() {
        return limit;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public boolean validateLimit(double amount) {
        return amount <= this.limit;
    }

    public void buyItem(Order order){
        this.orders.add(order);
        this.limit -= order.getPrice();
    }
}
