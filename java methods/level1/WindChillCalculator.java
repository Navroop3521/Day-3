import java.util.Scanner;

public class WindChillCalculator {

    // Method to calculate wind chill
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) 
               + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed (in miles per hour): ");
        double windSpeed = sc.nextDouble();

        // Calculate wind chill
        double windChill = calculateWindChill(temperature, windSpeed);

        // Display result
        System.out.println("The Wind Chill Temperature is: " + windChill);

        sc.close();
    }
}
