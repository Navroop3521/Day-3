package level2;

import java.util.Scanner;
public class VowelConsonantType {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        else {
            return "Not a Letter";
        }
    }

    public static String[][] analyzeCharacters(String text) {
        int n = text.length();
        String[][] result = new String[n][2];

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch); 
            result[i][1] = checkCharType(ch); 
        }
        return result;
    }
    public static void displayResult(String[][] table) {
        System.out.println("\nCharacter\tType");
        System.out.println("--------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String[][] result = analyzeCharacters(input);

        displayResult(result);

        sc.close();
    }
}
