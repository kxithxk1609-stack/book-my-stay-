import java.util.HashMap;
import java.util.Map;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Create HashMap (Bogie → Capacity)
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert values using put()
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);
        bogieCapacity.put("Cargo", 100);

        // Display all bogies with capacity
        System.out.println("Bogie Capacity Details:\n");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(
                entry.getKey() + " → Capacity: " + entry.getValue()
            );
        }
    }
}