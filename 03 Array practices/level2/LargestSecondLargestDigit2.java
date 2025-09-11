import java.util.Scanner;

public class LargestSecondLargestDigit2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10;  
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;

            if (index == maxDigit) {
                maxDigit += 10; 
                int[] temp = new int[maxDigit];
                for (int j = 0; j < digits.length; j++) {
                    temp[j] = digits[j];
                }
                digits = temp; 
            }

            digits[index] = digit;
            index++;
            number = number / 10;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            int d = digits[i];
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }

        System.out.println("\n--- Results ---");
        System.out.print("Digits stored in array: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        System.out.println("\nLargest digit = " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit = Not available (all digits same)");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        input.close();
    }
}
