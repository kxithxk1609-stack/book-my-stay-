<<<<<<< HEAD
import java.util.Scanner;

public class PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

=======
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String str = "madam";
>>>>>>> main
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

<<<<<<< HEAD
        if (str.equalsIgnoreCase(rev)) {
=======
        if (str.equals(rev)) {
>>>>>>> main
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
<<<<<<< HEAD

        sc.close();
=======
>>>>>>> main
    }
}