package level2;

import java.util.Scanner;

public class ManualTrimDemo {
    public static int[] findTrimIndexes(String text) {
        int n = text.length();
        int start = 0, end = n - 1;
        while (start < n && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end }; 
    }
    public static String manualSubstring(String text, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
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
        System.out.print("Enter a string with leading/trailing spaces: ");
        String text = sc.nextLine();
        int[] indexes = findTrimIndexes(text);

        String manualTrimmed = "";
        if (indexes[0] <= indexes[1]) { 
            manualTrimmed = manualSubstring(text, indexes[0], indexes[1]);
        }

        String builtinTrimmed = text.trim();
        boolean isSame = compareStrings(manualTrimmed, builtinTrimmed);
        System.out.println("\nManual Trimmed: \"" + manualTrimmed + "\"");
        System.out.println("Built-in Trimmed: \"" + builtinTrimmed + "\"");
        System.out.println("Are both same? " + isSame);

        sc.close();
    }
}
