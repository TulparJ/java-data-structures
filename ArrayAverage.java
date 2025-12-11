public class ArrayAverage {

    public static double average(int[] arr) {
        int sum = 0;
        for (int n : arr) sum += n;
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        int[] nums = {85, 90, 78, 92, 88};
        System.out.println("Average: " + average(nums));
    }
}
