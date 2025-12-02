package ch03.apps;

import java.util.Scanner;

public class Assignment3 {

    // Recursive Fibonacci
    static int recursiveFibonacci(int n) {
        if (n <= 2) return n - 1;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    // Iterative Fibonacci
    static int iterativeFibonacci(int n) {
        if (n <= 2) return n - 1;
        int a = 0, b = 1;
        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int n = in.nextInt();

        System.out.println("Recursive version, " + n + "th Fibonacci number is: " + recursiveFibonacci(n));
        System.out.println("Non-recursive version, " + n + "th Fibonacci number is: " + iterativeFibonacci(n));
    }
}
