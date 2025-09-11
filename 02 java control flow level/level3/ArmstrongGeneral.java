package level3;

import java.util.Scanner;

public class ArmstrongGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Negative numbers are not considered for Armstrong check.");
            sc.close();
            return;
        }

        int originalNumber = number;
        int sum = 0;
        int nDigits = String.valueOf(number).length();

        while (originalNumber != 0) {
            int digit = originalNumber % 10;

            int power = 1;
            for (int i = 0; i < nDigits; i++) {
                power *= digit;
            }
            sum += power;

            originalNumber /= 10;
        }

        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}
