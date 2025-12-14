import java.util.ArrayList;

class Contact {
    private String name;
    private String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public String toString() {
        return name + " — " + phone;
    }
}

public class ContactBook {
    public static void main(String[] args) {

        ArrayList<Contact> contacts = new ArrayList<>();

        // Add some contacts
        contacts.add(new Contact("Aibi", "555-1234"));
        contacts.add(new Contact("Tulpar", "555-5678"));
        contacts.add(new Contact("Sammy", "555-9999"));

        System.out.println("📒 Contact Book:");
        for (Contact c : contacts) {
            System.out.println("- " + c);
        }

        // Remove a contact
        System.out.println("\nRemoving Aibi...");
        contacts.remove(0);

        System.out.println("\n📒 Updated Contacts:");
        for (Contact c : contacts) {
            System.out.println("- " + c);
        }
    }
}
