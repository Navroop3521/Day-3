import java.util.Scanner;

public class AthleteRunCalculator {

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;   
        double totalDistance = 5000;               
        return totalDistance / perimeter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangular park (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 of the triangular park (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 of the triangular park (in meters): ");
        double side3 = sc.nextDouble();

        // Calculate rounds
        double rounds = calculateRounds(side1, side2, side3);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to run 5 km.");

        sc.close();
    }
}
