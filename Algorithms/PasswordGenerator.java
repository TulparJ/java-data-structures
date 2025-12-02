package algorithms;

import java.security.SecureRandom;
import java.util.Scanner;

public class PasswordGenerator {

    private static final String LETTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String SYMBOLS = "!@#$%^&*()-_=+<>?";
    private static final String ALL = LETTERS + DIGITS + SYMBOLS;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SecureRandom random = new SecureRandom();

        System.out.print("Password length: ");
        int length = scanner.nextInt();

        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(ALL.length());
            password.append(ALL.charAt(index));
        }

        System.out.println("Generated password: " + password);

        scanner.close();
    }
}
