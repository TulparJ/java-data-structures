package wrestlingranking;

public class Node {
    public Wrestler data;
    public Node next;

    public Node(Wrestler data) {
        this.data = data;
        this.next = null;
    }
}
