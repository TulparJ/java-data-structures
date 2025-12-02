package algorithms;

import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = scanner.nextLine();

        if (isPalindrome(word)) {
            System.out.println("\"" + word + "\" is a palindrome!");
        } else {
            System.out.println("\"" + word + "\" is NOT a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\s+", ""); // ignore spaces
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
