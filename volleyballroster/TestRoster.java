package volleyballroster;

public class TestRoster {
    public static void main(String[] args) {

        Roster roster = new Roster();

        // Add some players
        roster.addPlayer(new Player("Tulpar", 1, "Outside Hitter"));
        roster.addPlayer(new Player("Aibi", 12, "Setter"));
        roster.addPlayer(new Player("Aylin", 7, "Middle Blocker"));
        roster.addPlayer(new Player("Khuat", 9, "Libero"));

        // Print entire roster
        roster.printRoster();
        System.out.println("\nTotal players: " + roster.countPlayers());

        // Find player
        System.out.println("\nSearching for #7...");
        Player p = roster.findByNumber(7);
        if (p != null) {
            System.out.println("Found: " + p);
        } else {
            System.out.println("Player not found.");
        }

        // Remove a player
        System.out.println("\nRemoving 'Aibi'...");
        boolean removed = roster.removePlayer("Aibi");
        System.out.println(removed ? "Removed successfully." : "Player not found.");

        // Print updated roster
        System.out.println();
        roster.printRoster();
        System.out.println("\nTotal players: " + roster.countPlayers());
    }
}
