import java.util.ArrayList;

public class StudySessionTracker {
    private ArrayList<Integer> sessions = new ArrayList<>();

    public void addSession(int minutes) {
        sessions.add(minutes);
    }

    public int totalMinutes() {
        int sum = 0;
        for (int m : sessions) sum += m;
        return sum;
    }

    public static void main(String[] args) {
        StudySessionTracker tracker = new StudySessionTracker();

        tracker.addSession(45);
        tracker.addSession(30);
        tracker.addSession(60);

        System.out.println("Total minutes studied: " + tracker.totalMinutes());
    }
}
