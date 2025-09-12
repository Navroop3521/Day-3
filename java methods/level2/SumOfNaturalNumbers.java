import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to find sum of n natural numbers
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check for natural number
        if (n <= 0) {
            System.out.println("Not a natural number! Exiting...");
            return;
        }

        // Compute sums
        int recursiveSum = sumRecursive(n);
        int formulaSum = sumFormula(n);

        // Display results
        System.out.println("Sum of first " + n + " natural numbers (Recursive): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (Formula): " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println(" Both computations match. The results are correct!");
        } else {
            System.out.println(" Results do not match. Something is wrong.");
        }

        sc.close();
    }
}
