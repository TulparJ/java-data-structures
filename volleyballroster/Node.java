package volleyballroster;

public class Node {
    public Player data;
    public Node next;

    public Node(Player data) {
        this.data = data;
        this.next = null;
    }
}
