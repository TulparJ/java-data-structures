public class StringReverser {
    public static String reverse(String s) {
        String result = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            result += s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String word = "Tulpar";
        System.out.println("Original: " + word);
        System.out.println("Reversed: " + reverse(word));
    }
}
