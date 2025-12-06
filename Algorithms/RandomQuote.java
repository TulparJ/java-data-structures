import java.util.Random;

public class RandomQuote {
    private static final String[] quotes = {
        "Хийхийг хүсвэл боломж олдоно.",
        "Зорилготой хүн замаа олдог.",
        "Өдөр бүр бага багаар урагшил.",
        "Чи чадна, зүгээр л үргэлжлүүл!"
    };

    public static void main(String[] args) {
        Random rand = new Random();
        int index = rand.nextInt(quotes.length);
        System.out.println("Random Quote: " + quotes[index]);
    }
}
