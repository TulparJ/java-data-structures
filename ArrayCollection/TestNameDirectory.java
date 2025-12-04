package arrays;

public class TestNameDirectory {
    public static void main(String[] args) {
        NameDirectory dir = new NameDirectory();

        dir.add("Tulpar");
        dir.add("Aibi");
        dir.add("Tuvshin");
        dir.add("Batsaikhan");
        dir.add("Nyamdorj");
        dir.add("Erdene"); // triggers expand()

        dir.print();

        System.out.println("\nSearching 'Tuvshin': index = " + dir.search("Tuvshin"));

        System.out.println("\nRemoving 'Aibi'...");
        dir.remove("Aibi");

        dir.print();
    }
}
