// Daily Java Practice
// Topic: Arrays + Loop

public class DailyJavaPractice {

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 7, 2, 9, 4};

        System.out.println("Max value: " + findMax(numbers));

        int check = 6;
        System.out.println(check + " is even? " + isEven(check));
    }
}
