package level1;

import java.util.Scanner;

public class RocketLaunch1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter countdown start number: ");
        int counter = sc.nextInt();
        for (int i = counter; i >= 1; i--) {
            System.out.println("Countdown" + i);
        }
        System.out.println("donee!");
    }
}