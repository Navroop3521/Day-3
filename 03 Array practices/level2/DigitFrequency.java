import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = input.nextLong();

        String numStr = Long.toString(number);
        int count = numStr.length();

        int[] digits = new int[count];
        for (int i = 0; i < count; i++) {
            digits[i] = numStr.charAt(i) - '0'; 
        }

        int[] frequency = new int[10];
        for (int digit : digits) {
            frequency[digit]++;
        }
        System.out.println("\nDigit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {  
                System.out.println("Digit " + i + " = " + frequency[i]);
            }
        }

        input.close();
    }
}
