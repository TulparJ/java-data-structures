package ch02.apps;

import ch02.stacks.*;
import support.LLNode;
import java.util.Scanner;
import java.util.Stack;

public class Assignment2
{
    public static void main(String[] args)
    {
        int number;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer numbers to add in the list or press -1 to stop: ");
        number = scan.nextInt();

        LLNode<Integer> numbers = null;
        while (number != -1)
        {
            LLNode<Integer> newNode = new LLNode<Integer>(number);
            newNode.setLink(numbers);
            numbers = newNode;
            number = scan.nextInt();
        }

        // call the new methods
        sumAndDisplay(numbers);
        printReverse(numbers);
    }

    // method 1: print sum of all elements
    public static void sumAndDisplay(LLNode<Integer> numbers)
    {
        int sum = 0;
        LLNode<Integer> current = numbers;

        while (current != null)
        {
            sum += current.getInfo();
            current = current.getLink();
        }

        System.out.println("Sum of Elements is " + sum);
    }

    // method 2: print list in reverse order
    public static void printReverse(LLNode<Integer> numbers)
    {
        if (numbers == null)
        {
            System.out.println("The list is empty.");
            return;
        }

        Stack<Integer> stack = new Stack<>();
        LLNode<Integer> current = numbers;

        while (current != null)
        {
            stack.push(current.getInfo());
            current = current.getLink();
        }

        System.out.print("The list elements in the reverse order: ");
        while (!stack.isEmpty())
        {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
