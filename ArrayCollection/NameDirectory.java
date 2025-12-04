package arrays;

public class NameDirectory {
    private String[] names;
    private int size;

    public NameDirectory() {
        names = new String[5];
        size = 0;
    }

    public void add(String name) {
        if (size == names.length) expand();
        names[size++] = name;
    }

    private void expand() {
        String[] temp = new String[names.length * 2];
        for (int i = 0; i < names.length; i++) temp[i] = names[i];
        names = temp;
    }

    public boolean remove(String name) {
        for (int i = 0; i < size; i++) {
            if (names[i].equals(name)) {
                for (int j = i; j < size - 1; j++) {
                    names[j] = names[j + 1];
                }
                size--;
                return true;
            }
        }
        return false;
    }

    public int search(String name) {
        for (int i = 0; i < size; i++) {
            if (names[i].equals(name)) return i;
        }
        return -1;
    }

    public void print() {
        System.out.println("\n=== Mongolian Name Directory ===");
        for (int i = 0; i < size; i++) {
            System.out.println("- " + names[i]);
        }
    }
}
