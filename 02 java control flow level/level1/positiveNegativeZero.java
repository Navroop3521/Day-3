package level1;

import java.util.Scanner;

public class positiveNegativeZero {
    public static void main(String[] args) {
        Scanner Sc5 = new Scanner(System.in);
        System.out.println("enter a number");
        int num = Sc5.nextInt();
        if (num > 0) {
            System.out.println("number is positive");
        } else if (num < 0) {
            System.out.println("number is negative");
        } else {
            System.out.println("number equals to zerro");
        }
    }
}
