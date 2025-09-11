import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int originalNumber = number;
        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        int index = count - 1;
        while (number != 0) {
            digits[index] = number % 10;
            number /= 10;
            index--;
        }

        int[] reverseDigits = new int[count];
        for (int i = 0; i < count; i++) {
            reverseDigits[i] = digits[count - 1 - i];
        }
        System.out.println("\nOriginal number: " + originalNumber);

        System.out.print("Digits in order: ");
        for (int d : digits) {
            System.out.print(d + " ");
        }

        System.out.print("\nDigits in reverse order: ");
        for (int d : reverseDigits) {
            System.out.print(d + " ");
        }

        System.out.print("\nReversed number: ");
        for (int d : reverseDigits) {
            System.out.print(d);
        }

        input.close();
    }
}
