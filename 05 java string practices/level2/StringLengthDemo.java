package level2;

import java.util.Scanner;

public class StringLengthDemo {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // -------------------------------------
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();
        int manualLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("\nManual length calculation: " + manualLength);
        System.out.println("Built-in length() method: " + builtInLength);

        sc.close();
    }
}
