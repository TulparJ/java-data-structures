package wrestlingranking;

public class Wrestler {
    private String name;
    private String rank;
    private int wins;

    // Rank values: Начин, Заан, Арслан, Аварга
    public Wrestler(String name, String rank, int wins) {
        this.name = name;
        this.rank = rank;
        this.wins = wins;
    }

    public String getName() {
        return name;
    }

    public String getRank() {
        return rank;
    }

    public int getWins() {
        return wins;
    }

    public void addWin() {
        wins++;
    }

    public void promote() {
        if (rank.equalsIgnoreCase("Начин")) rank = "Заан";
        else if (rank.equalsIgnoreCase("Заан")) rank = "Арслан";
        else if (rank.equalsIgnoreCase("Арслан")) rank = "Аварга";
        else rank = "Аварга"; // already highest
    }

    @Override
    public String toString() {
        return name + " - " + rank + " (" + wins + " wins)";
    }
}
