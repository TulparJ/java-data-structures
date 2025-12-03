package linkedlists;

public class TestLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        list.addLast(25);

        list.printList();

        System.out.println("Searching 20: " + list.search(20));
        System.out.println("Searching 99: " + list.search(99));

        System.out.println("\nRemoving 10...");
        list.remove(10);
        list.printList();

        System.out.println("Size: " + list.size());
    }
}
