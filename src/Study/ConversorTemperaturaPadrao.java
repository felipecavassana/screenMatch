package Study;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double temperaturaC) {
        double temperaturaF = (temperaturaC * 9 / 5) + 32;
        System.out.println(String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit", temperaturaC, temperaturaF));
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaF) {
        double temperaturaC = (temperaturaF - 32) * 5 / 9;
        System.out.println(String.format("A temperatura de %.2f Fahrenheit é equivalente a %.2f Celsius", temperaturaF, temperaturaC));
    }
}
