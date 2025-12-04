package arrays;

public class Gradebook {
    private double[] grades;
    private int size;

    public Gradebook() {
        grades = new double[5];
        size = 0;
    }

    public void addGrade(double g) {
        if (size == grades.length) expand();
        grades[size++] = g;
    }

    private void expand() {
        double[] temp = new double[grades.length * 2];
        for (int i = 0; i < grades.length; i++) {
            temp[i] = grades[i];
        }
        grades = temp;
    }

    public boolean removeGrade(double g) {
        for (int i = 0; i < size; i++) {
            if (grades[i] == g) {
                for (int j = i; j < size - 1; j++) {
                    grades[j] = grades[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public double getAverage() {
        if (size == 0) return 0;
        double total = 0;
        for (int i = 0; i < size; i++) total += grades[i];
        return total / size;
    }

    public double getHighest() {
        if (size == 0) return 0;
        double max = grades[0];
        for (int i = 1; i < size; i++) {
            if (grades[i] > max) max = grades[i];
        }
        return max;
    }

    public double getLowest() {
        if (size == 0) return 0;
        double min = grades[0];
        for (int i = 1; i < size; i++) {
            if (grades[i] < min) min = grades[i];
        }
        return min;
    }

    public void printGrades() {
        System.out.println("\n=== Gradebook ===");
        for (int i = 0; i < size; i++) {
            System.out.println("Grade " + (i + 1) + ": " + grades[i]);
        }
    }
}
