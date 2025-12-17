// Today's Volleyball Java
// Theme: Volleyball Practice Drills
// Topic: Arrays + Conditionals

public class TodayVolleyballJava {

    // Count successful serves (score >= 8)
    public static int successfulServes(int[] scores) {
        int count = 0;
        for (int s : scores) {
            if (s >= 8) {
                count++;
            }
        }
        return count;
    }

    public static String practiceFeedback(int successful) {
        if (successful >= 8) return "Elite session 🏐🔥";
        if (successful >= 5) return "Solid work";
        return "Needs more reps";
    }

    public static void main(String[] args) {
        // serve accuracy scores out of 10
        int[] serveScores = {7, 8, 9, 6, 10, 8, 7, 9};

        int success = successfulServes(serveScores);
        System.out.println("Successful serves: " + success);
        System.out.println("Coach feedback: " + practiceFeedback(success));
    }
}
