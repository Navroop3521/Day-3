import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Method to calculate sum using loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;  // add i to sum
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Call method
        int result = calculateSum(n);

        // Display result
        System.out.println("The sum of first " + n + " natural numbers is: " + result);

        sc.close();
    }
}
