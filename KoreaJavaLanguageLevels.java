// Korea Java Project
// Theme: Korean Language Level Evaluation 🇰🇷
// Topic: Conditionals

public class KoreaJavaLanguageLevels {

    public static String languageLevel(int score) {
        if (score >= 230) return "Advanced (TOPIK 6)";
        if (score >= 190) return "Upper-Intermediate (TOPIK 5)";
        if (score >= 150) return "Intermediate (TOPIK 4)";
        if (score >= 120) return "Basic (TOPIK 3)";
        return "Beginner";
    }

    public static void main(String[] args) {
        int examScore = 165;
        System.out.println("Language level: " + languageLevel(examScore));
    }
}
