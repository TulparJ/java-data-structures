// Japan Java Project
// Theme: Tea Ceremony Steps 🍵
// Topic: Arrays + Loops

public class JapanJavaTeaCeremony {

    public static void printSteps(String[] steps) {
        for (int i = 0; i < steps.length; i++) {
            System.out.println((i + 1) + ". " + steps[i]);
        }
    }

    public static int countSteps(String[] steps) {
        return steps.length;
    }

    public static void main(String[] args) {
        String[] ceremonySteps = {
            "Clean utensils",
            "Prepare matcha",
            "Whisk tea",
            "Serve tea",
            "Bow respectfully"
        };

        printSteps(ceremonySteps);
        System.out.println("Total steps:", countSteps(ceremonySteps));
    }
}
