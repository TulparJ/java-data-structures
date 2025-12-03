package linkedlists;

public class TestPlaylist {
    public static void main(String[] args) {
        Playlist p = new Playlist();

        p.addSong("Haru", "The Hu");
        p.addSong("Shivers", "Ed Sheeran");
        p.addSong("Mockingbird", "Eminem");

        p.printPlaylist();

        System.out.println("\nRemoving 'Shivers'...");
        p.removeSong("Shivers");

        p.printPlaylist();
    }
}
