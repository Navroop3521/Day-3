import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeating(String text) {
        int[] freq = new int[256]; 
        int n = text.length();
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            freq[(int) ch]++;
        }

        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            if (freq[(int) ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        char result = findFirstNonRepeating(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
