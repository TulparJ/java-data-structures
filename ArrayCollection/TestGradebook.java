package arrays;

public class TestGradebook {
    public static void main(String[] args) {
        Gradebook g = new Gradebook();

        g.addGrade(95.0);
        g.addGrade(88.5);
        g.addGrade(76.0);
        g.addGrade(92.3);
        g.addGrade(81.5);
        g.addGrade(99.0); // triggers expand()

        g.printGrades();

        System.out.println("\nHighest: " + g.getHighest());
        System.out.println("Lowest: " + g.getLowest());
        System.out.println("Average: " + g.getAverage());

        System.out.println("\nRemoving grade 76.0...");
        g.removeGrade(76.0);

        g.printGrades();
        System.out.println("\nNew Average: " + g.getAverage());
    }
}
