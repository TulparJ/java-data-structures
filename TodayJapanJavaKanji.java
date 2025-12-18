// Today's Japan Java Project
// Theme: Kanji Stroke Count Study
// Topic: Arrays + Conditionals

public class TodayJapanJavaKanji {

    public static int hardestKanji(int[] strokes) {
        int max = strokes[0];
        for (int s : strokes) {
            if (s > max) {
                max = s;
            }
        }
        return max;
    }

    public static String difficultyLevel(int strokes) {
        if (strokes >= 15) return "Hard";
        if (strokes >= 8) return "Medium";
        return "Easy";
    }

    public static void main(String[] args) {
        // Example kanji stroke counts
        int[] kanjiStrokes = {3, 5, 8, 13, 16};

        int hardest = hardestKanji(kanjiStrokes);
        System.out.println("Hardest kanji strokes: " + hardest);
        System.out.println("Difficulty level: " + difficultyLevel(hardest));
    }
}
