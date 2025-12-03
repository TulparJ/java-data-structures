package linkedlists;

public class MyLinkedList {
    private Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
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

    public boolean search(int target) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) return true;
            temp = temp.next;
        }
        return false;
    }

    public boolean remove(int target) {
        if (head == null) return false;

        if (head.data == target) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != target) {
            temp = temp.next;
        }

        if (temp.next == null) return false;

        temp.next = temp.next.next;
        return true;
    }

    public void printList() {
        Node temp = head;
        System.out.print("List: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
