package wrestlingranking;

public class WrestlerList {

    private Node head;

    public void addWrestler(Wrestler w) {
        Node newNode = new Node(w);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public boolean removeWrestler(String name) {
        if (head == null) return false;

        if (head.data.getName().equalsIgnoreCase(name)) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null &&
                !temp.next.data.getName().equalsIgnoreCase(name)) {
            temp = temp.next;
        }

        if (temp.next == null) return false;

        temp.next = temp.next.next;
        return true;
    }

    public Wrestler search(String name) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.getName().equalsIgnoreCase(name)) return temp.data;
            temp = temp.next;
        }
        return null;
    }

    public void promote(String name) {
        Wrestler w = search(name);
        if (w != null) {
            w.promote();
        }
    }

    public void printRankings() {
        System.out.println("=== Mongolian Wrestling Rankings ===");
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
