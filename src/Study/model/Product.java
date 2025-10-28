package Study.model;

import Study.Calculavel;

public class Product implements Calculavel {
    private String name;
    private double price;
    private int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void applyDiscount(int percentage) {
        double discount = price * percentage / 100;
        price -= discount;
    }

    @Override
    public double calcularPrecoFinal() {
        return price;
    }

    @Override
    public String toString() {
        return this.getName() +" ($ "+ this.getPrice() +")";
    }
}
