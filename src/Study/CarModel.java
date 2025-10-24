package Study;

public class CarModel extends Car{
    private int year;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    void showInfos() {
        System.out.println("Model: " + super.getModel());
        System.out.println("Year: " + this.year);
        System.out.println("Color: " + this.color);
        System.out.println("Preço Ano 1: " + super.getPrice1());
        System.out.println("Preço Ano 2: " + super.getPrice2());
        System.out.println("Preço Ano 3: " + super.getPrice3());
        System.out.println("Menor Preço: " + super.calcularMenorPreco());
        System.out.println("Maior Preço: " + super.calcularMaiorPreco());

    }

    int calculateTime() {
        return 2025 - this.year;
    }
}
