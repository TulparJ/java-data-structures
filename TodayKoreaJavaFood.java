// Today's Korea Java Project
// Theme: Korean Food Spice Levels 🌶️
// Topic: Arrays + Conditionals

public class TodayKoreaJavaFood {

    public static double averageSpice(int[] levels) {
        int sum = 0;
        for (int l : levels) {
            sum += l;
        }
        return (double) sum / levels.length;
    }

    public static String spiceWarning(int level) {
        if (level >= 8) return "🔥 Extremely spicy";
        if (level >= 5) return "Spicy";
        return "Mild";
    }

    public static void main(String[] args) {
        // spice levels from 1–10
        int[] foods = {3, 6, 8, 5, 9};

        System.out.println("Average spice level: " + averageSpice(foods));

        int todayFood = 9;
        System.out.println("Today's food level: " + spiceWarning(todayFood));
    }
}
