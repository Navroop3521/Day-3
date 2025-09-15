import java.util.Scanner;

public class LowerCaseComparison {
    public static String manualToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result += (char) (ch + 32);
            } else {
                result += ch; 
            }
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = sc.nextLine();
        String manualLower = manualToLowerCase(text);
        String builtInLower = text.toLowerCase();
        boolean result = compareStrings(manualLower, builtInLower);
        
        System.out.println("\nManual Lowercase Conversion: " + manualLower);
        System.out.println("Built-in toLowerCase(): " + builtInLower);
        System.out.println("Comparison result: " + result);

        sc.close();
    }
}
