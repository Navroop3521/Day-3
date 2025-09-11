package level1;

import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Number " + num1 + " is First largest");
            if (num2 >= num3) {
                System.out.println("Number " + num2 + " is second largest");
                System.out.println("Number " + num3 + " is Third Largest");
            } else {
                System.out.println("Number " + num3 + " is second largest");
                System.out.println("Number " + num2 + " is Third Largest");
            }
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Number " + num2 + " is First largest");
            if (num1 >= num3) {
                System.out.println("Number " + num1 + " is second largest");
                System.out.println("Number " + num3 + " Third Largest");
            } else {
                System.out.println("Number " + num3 + " is second largest");
                System.out.println("Number " + num1 + " Third Largest");
            }
        } else {
            System.out.println("Number " + num3 + " is First largest");
            if (num1 >= num2) {
                System.out.println("Number " + num1 + " is second largest");
                System.out.println("Number " + num2 + " Third Largest");
            } else {
                System.out.println("Number " + num2 + " is second largest");
                System.out.println("Number " + num1 + " Third Largest");
            }
        }
    }
}