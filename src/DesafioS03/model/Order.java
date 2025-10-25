package DesafioS03.model;

public class Order implements Comparable<Order>{
    private String name;
    private double price;

    public Order(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Order order) {
        return Double.valueOf(this.price).compareTo(Double.valueOf(order.price));
    }

    @Override
    public String toString() {
        return this.name +"\t-\t"+ this.price;
    }
}
