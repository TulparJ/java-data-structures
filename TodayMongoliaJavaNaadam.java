// Today's Mongolia Java
// Theme: Naadam Archery Scores
// Topic: Arrays + Stats

public class TodayMongoliaJavaNaadam {

    public static int highestScore(int[] scores) {
        int max = scores[0];
        for (int s : scores) {
            if (s > max) max = s;
        }
        return max;
    }

    public static double averageScore(int[] scores) {
        int sum = 0;
        for (int s : scores) {
            sum += s;
        }
        return (double) sum / scores.length;
    }

    public static void main(String[] args) {
        int[] scores = {27, 30, 25, 29, 28};

        System.out.println("Highest score: " + highestScore(scores));
        System.out.println("Average score: " + averageScore(scores));
    }
}
