package Study.model;

public class Car {
    private String model;
    private double price1;
    private double price2;
    private double price3;

    public double getPrice1() {
        return price1;
    }

    public double getPrice2() {
        return price2;
    }

    public double getPrice3() {
        return price3;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void definePrices(double p1, double p2, double p3){
        this.price1 = p1;
        this.price2 = p2;
        this.price3 = p3;
    }

    public double calcularMenorPreco() {
        double menorPreco = price1;

        if (price2 < menorPreco) {
            menorPreco = price2;
        }

        if (price3 < menorPreco) {
            menorPreco = price3;
        }

        return menorPreco;
    }

    public double calcularMaiorPreco() {
        double maiorPreco = price1;

        if (price2 > maiorPreco) {
            maiorPreco = price2;
        }

        if (price3 > maiorPreco) {
            maiorPreco = price3;
        }

        return maiorPreco;
    }
}
