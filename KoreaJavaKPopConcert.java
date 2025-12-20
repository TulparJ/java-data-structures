// Korea Java Project
// Theme: K-pop Concert Ticket Sales 🎤
// Topic: Arrays + Loops

public class KoreaJavaKPopConcert {

    public static int totalTickets(int[] tickets) {
        int sum = 0;
        for (int t : tickets) {
            sum += t;
        }
        return sum;
    }

    public static int maxTickets(int[] tickets) {
        int max = tickets[0];
        for (int t : tickets) {
            if (t > max) max = t;
        }
        return max;
    }

    public static void main(String[] args) {
        String[] concerts = {"BTS", "Blackpink", "NewJeans"};
        int[] ticketSales = {5000, 8000, 3000};

        System.out.println("Total tickets sold: " + totalTickets(ticketSales));
        System.out.println("Highest tickets sold: " + maxTickets(ticketSales));
    }
}
