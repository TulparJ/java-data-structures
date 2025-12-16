// Mongolia Java Project
// Topic: Arrays + Average Calculation

public class MongoliaJavaProject {

    // Example: average winter temperatures (°C) in Mongolia
    public static double averageTemperature(int[] temps) {
        int sum = 0;
        for (int t : temps) {
            sum += t;
        }
        return (double) sum / temps.length;
    }

    public static int coldestDay(int[] temps) {
        int min = temps[0];
        for (int t : temps) {
            if (t < min) {
                min = t;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] winterTemps = {-25, -30, -28, -35, -22};

        System.out.println("Average winter temperature: " + averageTemperature(winterTemps));
        System.out.println("Coldest day temperature: " + coldestDay(winterTemps));
    }
}
