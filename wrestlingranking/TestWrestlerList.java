package wrestlingranking;

public class TestWrestlerList {
    public static void main(String[] args) {
        WrestlerList list = new WrestlerList();

        list.addWrestler(new Wrestler("Batsaikhan", "Арслан", 52));
        list.addWrestler(new Wrestler("Tuvshin", "Заан", 34));
        list.addWrestler(new Wrestler("Nyamdoo", "Начин", 21));

        list.printRankings();

        System.out.println("\nPromoting Nyamdoo...\n");
        list.promote("Nyamdoo");

        list.printRankings();

        System.out.println("\nRemoving Tuvshin...\n");
        list.removeWrestler("Tuvshin");

        list.printRankings();
    }
}
