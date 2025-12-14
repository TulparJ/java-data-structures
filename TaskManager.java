import java.util.LinkedList;

public class TaskManager {
    public static void main(String[] args) {

        LinkedList<String> tasks = new LinkedList<>();

        // Add tasks
        tasks.add("Finish Java homework");
        tasks.add("Go to the gym");
        tasks.add("Study for Networking exam");
        tasks.add("Call cousin");

        // Print tasks
        System.out.println("=== Today's Tasks ===");
        for (String task : tasks) {
            System.out.println("- " + task);
        }

        // Remove first task
        System.out.println("\nRemoving first task...");
        tasks.removeFirst();

        // Print updated list
        System.out.println("\n=== Updated Task List ===");
        for (String task : tasks) {
            System.out.println("- " + task);
        }
    }
}
