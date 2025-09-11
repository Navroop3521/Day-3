import java.util.Scanner;

public class StoreNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10]; 
        double total = 0.0;
        int index = 0;
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = input.nextDouble();
            if (num <= 0) {
                break;
            }

            if (index == 10) {
                System.out.println("Maximum of 10 numbers reached!");
                break;
            }

            numbers[index] = num;
            index++;
        }

        System.out.println("\nYou entered the following numbers:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal sum of numbers = " + total);

        input.close();
    }
}
