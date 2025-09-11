
import java.util.Scanner;

public class BasicCalculator_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();

        double add = num1 + num2;
        double sub = num1 - num2;
        double multiply = num1 * num2;
        double division = num1 / num2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + num1 + " and " + num2 + " is "
                + add + ", " + sub + ", " + multiply + ", and " + division);
        input.close();
    }
}
