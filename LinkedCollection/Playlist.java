package linkedlists;

public class Playlist {
    private Song head;

    public void addSong(String title, String artist) {
        Song newSong = new Song(title, artist);
        newSong.setNext(head);
        head = newSong;
    }

    public void removeSong(String title) {
        Song curr = head;
        Song prev = null;

        while (curr != null) {
            if (curr.getTitle().equals(title)) {
                if (prev == null) head = curr.getNext();
                else prev.setNext(curr.getNext());
                System.out.println(title + " removed.");
                return;
            }
            prev = curr;
            curr = curr.getNext();
        }
        System.out.println("Song not found.");
    }

    public void printPlaylist() {
        Song curr = head;
        System.out.println("\n=== Playlist ===");
        while (curr != null) {
            System.out.println(curr.getTitle() + " - " + curr.getArtist());
            curr = curr.getNext();
        }
    }
}
