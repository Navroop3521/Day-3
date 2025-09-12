import java.util.Scanner;

public class TrigonometricCalculator {

    // Method to calculate sine, cosine and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        // Convert degrees to radians
        double radians = Math.toRadians(angle);

        // Calculate trigonometric values
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        // Return as array
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        // Call method
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.println("For angle " + angle + "° :");
        System.out.println("Sine   = " + results[0]);
        System.out.println("Cosine = " + results[1]);
        System.out.println("Tangent= " + results[2]);

        sc.close();
    }
}
