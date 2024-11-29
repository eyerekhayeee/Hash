import java.util.HashMap;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Contact Manager!");
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Display All Contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Clear the buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phone = scanner.nextLine();
                    contacts.put(name, phone);
                    System.out.println("Contact added successfully!");
                    break;

                case 2:
                    System.out.print("Enter contact name to view: ");
                    String searchName = scanner.nextLine();
                    if (contacts.containsKey(searchName)) {
                        System.out.println(searchName + "'s Phone: " + contacts.get(searchName));
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 3:
                    System.out.print("Enter contact name to delete: ");
                    String deleteName = scanner.nextLine();
                    if (contacts.remove(deleteName) != null) {
                        System.out.println("Contact deleted successfully!");
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;

                case 4:
                    System.out.println("\nAll Contacts:");
                    for (String contactName : contacts.keySet()) {
                        System.out.println(contactName + ": " + contacts.get(contactName));
                    }
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
