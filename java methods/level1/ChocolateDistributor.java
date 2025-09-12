import java.util.Scanner;

public class ChocolateDistributor {

    // Method to calculate chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;   // chocolates each child gets
        int remainder = number % divisor;  // chocolates left
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter total number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int numberOfChildren = sc.nextInt();

        // Call method
        int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        // Display result
        System.out.println("Each child will get " + result[0] + " chocolates.");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}
