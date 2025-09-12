import java.util.Scanner;

public class AthleteRunCalculator {

    // Method to calculate number of rounds required
    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;   // perimeter in meters
        double totalDistance = 5000;                // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3);

        // Display output (rounded up since the athlete must complete full rounds)
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to run 5 km.");

        sc.close();
    }
}
