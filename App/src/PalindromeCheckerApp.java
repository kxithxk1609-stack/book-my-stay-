import java.util.LinkedHashSet;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // LinkedHashSet maintains order + uniqueness
        LinkedHashSet<String> bookings = new LinkedHashSet<>();

        // Add room bookings
        bookings.add("Room101");
        bookings.add("Room102");
        bookings.add("Room103");
        bookings.add("Room104");

        // Attempt duplicate booking
        bookings.add("Room102"); // will be ignored automatically

        // Display final booking order
        System.out.println("Final Room Booking Order:");

        for (String room : bookings) {
            System.out.println(room);
        }
    }
}