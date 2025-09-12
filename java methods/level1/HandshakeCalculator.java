import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Get input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Step 2: Apply formula (n * (n - 1)) / 2
        int numberOfHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Step 3: Display result
        System.out.println("The maximum number of possible handshakes is: " + numberOfHandshakes);

        sc.close();
    }
}
