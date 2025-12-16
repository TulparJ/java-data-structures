// Mongolia Java Project
// Theme: Ulaanbaatar Winter Weather
// Topic: Arrays + Conditionals

public class MongoliaJavaUBWeather {

    // Count extreme cold days (below -30°C)
    public static int extremeColdDays(int[] temps) {
        int count = 0;
        for (int t : temps) {
            if (t < -30) {
                count++;
            }
        }
        return count;
    }

    public static String coldWarning(int temp) {
        if (temp <= -40) return "Extreme danger";
        if (temp <= -30) return "Very cold";
        if (temp <= -20) return "Cold";
        return "Normal winter day";
    }

    public static void main(String[] args) {
        int[] januaryTemps = {-22, -35, -40, -28, -33, -18};

        System.out.println("Extreme cold days: " + extremeColdDays(januaryTemps));

        int today = -40;
        System.out.println("Today's warning: " + coldWarning(today));
    }
}
