package level2;

import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter age of Anthony: ");
        int ageAnthony = sc.nextInt();

        System.out.print("Enter height of Amar: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter height of Akbar: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter height of Anthony: ");
        double heightAnthony = sc.nextDouble();

        // Find youngest
        if (ageAmar <= ageAkbar && ageAmar <= ageAnthony) {
            System.out.println("Youngest friend is Amar with age " + ageAmar);
        } else if (ageAkbar <= ageAmar && ageAkbar <= ageAnthony) {
            System.out.println("Youngest friend is Akbar with age " + ageAkbar);
        } else {
            System.out.println("Youngest friend is Anthony with age " + ageAnthony);
        }

        // Find tallest
        if (heightAmar >= heightAkbar && heightAmar >= heightAnthony) {
            System.out.println("Tallest friend is Amar with height " + heightAmar);
        } else if (heightAkbar >= heightAmar && heightAkbar >= heightAnthony) {
            System.out.println("Tallest friend is Akbar with height " + heightAkbar);
        } else {
            System.out.println("Tallest friend is Anthony with height " + heightAnthony);
        }

        sc.close();
    }
}
