package level1;

import java.util.Scanner;

public class divisibleBy5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if (num % 5 == 0) {
            System.out.println("Is the number  " + num + "   is divisible by 5?   - yess!!");
        } else {
            System.out.println("Is the number  " + num + "    is divisible by 5?  - Noo!!");

        }
    }
}