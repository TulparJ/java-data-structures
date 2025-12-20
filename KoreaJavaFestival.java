// Korea Java Project
// Theme: Korean Festival Attendance 🎉
// Topic: Arrays + Conditionals

public class KoreaJavaFestival {

    public static String festivalSize(int[] attendees, String[] names) {
        int max = attendees[0];
        int idx = 0;

        for (int i = 1; i < attendees.length; i++) {
            if (attendees[i] > max) {
                max = attendees[i];
                idx = i;
            }
        }

        if (max >= 5000) return names[idx] + " is a large festival!";
        else return names[idx] + " is a small festival.";
    }

    public static void main(String[] args) {
        String[] festivals = {"Boryeong Mud Festival", "Jinju Lantern Festival", "Andong Mask Dance"};
        int[] attendees = {6000, 3000, 2000};

        System.out.println(festivalSize(attendees, festivals));
    }
}
