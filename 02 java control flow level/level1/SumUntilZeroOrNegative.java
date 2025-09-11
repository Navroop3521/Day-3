package level1;
import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0; 
        System.out.println("Enter numbers to add (enter 0 or a negative number to stop):");
        while (true) { 
            double num = sc.nextDouble(); 
            if (num <= 0) {
                break; 
            }
            total += num; 
        }
        System.out.println("The total sum is: " + total);

    }
}
