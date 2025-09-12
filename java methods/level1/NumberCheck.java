import java.util.Scanner;

public class NumberCheck {

    // Method to check whether number is positive, negative or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;   // positive
        } else if (num < 0) {
            return -1;  // negative
        } else {
            return 0;   // zero
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Call method
        int result = checkNumber(number);

        // Display result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        sc.close();
    }
}
