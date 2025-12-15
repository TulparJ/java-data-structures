// Daily Java DSA
// Topic: Stack + String

import java.util.Stack;

public class DailyJavaDSA {

    public static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == '}' && top != '{') return false;
                if (c == ']' && top != '[') return false;
            }
        }
        return stack.isEmpty();
    }

    public static int countVowels(String s) {
        int count = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String test = "()[]{}";
        System.out.println("Valid parentheses? " + isValidParentheses(test));

        String word = "ComputerScience";
        System.out.println("Vowel count: " + countVowels(word));
    }
}
