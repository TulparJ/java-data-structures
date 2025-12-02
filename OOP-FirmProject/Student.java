package oop;

public class Student {

    private String name;
    private int id;
    private double gpa;

    public Student(String name, int id, double gpa) {
        this.name = name;
        this.id = id;
        this.gpa = gpa;
    }

    public void updateGpa(double newGpa) {
        if (newGpa < 0 || newGpa > 4.0) {
            System.out.println("Invalid GPA.");
        } else {
            this.gpa = newGpa;
            System.out.println("GPA updated to: " + gpa);
        }
    }

    public void printInfo() {
        System.out.println("Student Info:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Tulpar", 101, 3.8);

        s1.printInfo();
        s1.updateGpa(3.95);
        s1.updateGpa(5.0);  // should fail
    }
}
