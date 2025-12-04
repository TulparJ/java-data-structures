package arrays;

public class TestCityDirectory {
    public static void main(String[] args) {
        CityDirectory dir = new CityDirectory(3);

        dir.addCity("Ulaanbaatar");
        dir.addCity("Erdenet");
        dir.addCity("Darkhan");
        dir.addCity("Choibalsan"); // triggers resize

        dir.printCities();

        System.out.println("\nSearching for Erdenet: " + dir.searchCity("Erdenet"));
        System.out.println("Searching for Khovd: " + dir.searchCity("Khovd"));

        System.out.println("\nRemoving Darkhan...");
        System.out.println(dir.removeCity("Darkhan") ? "Removed!" : "Not found.");

        dir.printCities();

        System.out.println("\nTotal cities: " + dir.countCities());
    }
}
