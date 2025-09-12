import java.util.Scanner;

public class MaximumHandshakes {

    // Method to calculate maximum number of handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Calculate maximum handshakes
        int maxHandshakes = calculateHandshakes(n);

        // Display output
        System.out.println("The maximum number of handshakes among " + n + 
                           " students is: " + maxHandshakes);

        sc.close();
    }
}

