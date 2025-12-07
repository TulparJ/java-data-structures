public class TemperatureConverter {

    public static double celsiusToFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5/9;
    }

    public static void main(String[] args) {
        double c = 26;
        double f = 78.8;

        System.out.println(c + "°C = " + celsiusToFahrenheit(c) + "°F");
        System.out.println(f + "°F = " + fahrenheitToCelsius(f) + "°C");
    }
}
