
import java.util.Scanner;

public class BMICalculator {
    public static double[][] getInputData(Scanner scanner) {
        double[][] data = new double[10][2]; 

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        return data;
    }
    public static String[] calculateBMIStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        bmi = Math.round(bmi * 100.0) / 100.0;

        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[] { String.valueOf(bmi), status };
    }
    public static String[][] processBMIData(double[][] inputData) {
        String[][] result = new String[10][4]; 

        for (int i = 0; i < 10; i++) {
            double weight = inputData[i][0];
            double height = inputData[i][1];

            String[] bmiData = calculateBMIStatus(weight, height);

            result[i][0] = height + " cm";
            result[i][1] = weight + " kg";
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }

        return result;
    }

    public static void displayBMIData(String[][] data) {
        System.out.println("\n-------------------------------------------");
        System.out.println("Person\tHeight\t\tWeight\t\tBMI\t\tStatus");
        System.out.println("-----------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%-10s\t%-10s\t%-8s\t%s\n",
                    (i + 1), data[i][0], data[i][1], data[i][2], data[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[][] inputData = getInputData(scanner); // Step a
        String[][] bmiData = processBMIData(inputData); // b & c
        displayBMIData(bmiData); // d

        scanner.close();
    }
}
