package arrays;

public class CityDirectory {

    private String[] cities;
    private int size;

    public CityDirectory(int capacity) {
        cities = new String[capacity];
        size = 0;
    }

    // Add a city
    public void addCity(String city) {
        if (size == cities.length) {
            resize();
        }
        cities[size++] = city;
    }

    // Remove a city
    public boolean removeCity(String city) {
        for (int i = 0; i < size; i++) {
            if (cities[i].equalsIgnoreCase(city)) {
                for (int j = i; j < size - 1; j++) {
                    cities[j] = cities[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    // Search a city
    public boolean searchCity(String city) {
        for (int i = 0; i < size; i++) {
            if (cities[i].equalsIgnoreCase(city)) {
                return true;
            }
        }
        return false;
    }

    // Print directory
    public void printCities() {
        System.out.println("\n=== Mongolian Cities Directory ===");
        for (int i = 0; i < size; i++) {
            System.out.println("- " + cities[i]);
        }
    }

    // Resize array
    private void resize() {
        String[] newArr = new String[cities.length * 2];
        for (int i = 0; i < size; i++) {
            newArr[i] = cities[i];
        }
        cities = newArr;
    }

    public int countCities() {
        return size;
    }
}
