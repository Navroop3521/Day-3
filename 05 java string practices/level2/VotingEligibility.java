package level2;

import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(82) + 10; 
        }
        return ages;
    }

    public static String[][] checkEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false"; 
            } else if (ages[i] >= 18) {
                result[i][1] = "true"; 
            } else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.println("\nAge\tCan Vote?");
        System.out.println("-----------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] ages = generateAges(n);
        String[][] eligibility = checkEligibility(ages);
        displayTable(eligibility);

        sc.close();
    }
}
