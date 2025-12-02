package volleyballroster;

public class Roster {
    private Node head;   // first player in the list

    public Roster() {
        head = null;
    }

    // Add player to the END of the roster
    public void addPlayer(Player p) {
        Node newNode = new Node(p);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Remove player by name
    public boolean removePlayer(String name) {
        if (head == null) return false;

        // if first player is match
        if (head.data.getName().equalsIgnoreCase(name)) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data.getName().equalsIgnoreCase(name)) {
                current.next = current.next.next;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Find player by jersey number
    public Player findByNumber(int number) {
        Node current = head;
        while (current != null) {
            if (current.data.getNumber() == number) {
                return current.data;
            }
            current = current.next;
        }
        return null;
    }

    // Print whole roster
    public void printRoster() {
        if (head == null) {
            System.out.println("Roster is empty.");
            return;
        }

        Node current = head;
        System.out.println("=== Volleyball Team Roster ===");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Count players
    public int countPlayers() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
