package level1;
import java.util.Scanner;

public class SumUntilZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;  
        double num;         
        System.out.println("Enter numbers to add (enter 0 to stop):");
        num = sc.nextDouble();
        while (num != 0) {
            total += num;  
            System.out.print("Enter another number (0 to stop): ");
            num = sc.nextDouble();
        }

        System.out.println("The total sum is: " + total);

        sc.close();
    }
}
