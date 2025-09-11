import java.util.Scanner;

public class LargestSecondLargestDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            int digit = number % 10;   
            digits[index] = digit;     
            index++;
            number = number / 10;     

            if (index == maxDigit) { 
                break;
            }
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
        System.out.println("Largest digit = " + largest);
        if (secondLargest == -1) {
            System.out.println("Second largest digit = Not available (all digits same)");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        input.close();
    }
}
