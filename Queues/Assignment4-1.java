package ch04.apps;
import ch04.queues.*;
import java.util.Scanner;
import support.LLNode;

public class Assignment4 {

    private static LLNode<Integer> numbers = null;

    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer numbers to add in the list or press -1 to stop:\n");
        number = scan.nextInt();

        numbers = null;
        while (number != -1) {
            LLNode<Integer> newNode = new LLNode<Integer>(number);
            newNode.setLink(numbers);
            numbers = newNode;
            number = scan.nextInt();
        }

        System.out.println();
        oddQueue();
        System.out.println();
        evenQueue();

        scan.close();
    }

    public static void oddQueue() {
        QueueInterface<Integer> oddQ = new LinkedQueue<Integer>();

        LLNode<Integer> current = numbers;
        while (current != null) {
            int x = current.getInfo();
            if (x % 2 != 0) {
                oddQ.enqueue(x);
            }
            current = current.getLink();
        }

        if (oddQ.isEmpty()) {
            System.out.println("The odd queue is empty.");
        } else {
            System.out.println("The elements in the odd queue:");
            while (!oddQ.isEmpty()) {
                System.out.println(oddQ.dequeue());
            }
        }
    }

    public static void evenQueue() {
        QueueInterface<Integer> evenQ = new LinkedQueue<Integer>();

        LLNode<Integer> current = numbers;
        while (current != null) {
            int x = current.getInfo();
            if (x % 2 == 0) {
                evenQ.enqueue(x);
            }
            current = current.getLink();
        }

        if (evenQ.isEmpty()) {
            System.out.println("The even queue is empty.");
        } else {
            System.out.println("The elements in the even queue:");
            while (!evenQ.isEmpty()) {
                System.out.println(evenQ.dequeue());
            }
        }
    }
}