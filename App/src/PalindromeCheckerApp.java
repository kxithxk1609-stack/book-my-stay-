import java.util.LinkedList;
import java.util.HashSet;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // LinkedList to maintain booking order
        LinkedList<String> bookings = new LinkedList<>();

        // HashSet to prevent duplicate room IDs
        HashSet<String> uniqueRooms = new HashSet<>();

        // Sample room bookings (with duplicate)
        String[] rooms = {
            "Room101", "Room102", "Room103",
            "Room104", "Room105", "Room103"
        };

        // Add rooms while checking duplicates
        for (String room : rooms) {
            if (uniqueRooms.add(room)) {
                bookings.add(room);
            } else {
                System.out.println("Duplicate booking ignored: " + room);
            }
        }

        // Insert VIP room at position 2
        bookings.add(2, "VIP-Room");

        // Remove first and last booking
        bookings.removeFirst();
        bookings.removeLast();

        // Display final bookings
        System.out.println("\nFinal Room Bookings:");
        for (String room : bookings) {
            System.out.println(room);
        }
    }
}