package Study;

public class PerishableProduct extends Product{
    private String validateDate;

    public PerishableProduct(String name, double price, int quantity, String validateDate) {
        super(name, price, quantity);
        this.validateDate = validateDate;
    }
}
