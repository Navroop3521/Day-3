import java.util.Scanner;

public class CharArrayComparison {
    public static char[] manualToCharArray(String text) {
        char[] arr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printCharArray(char[] arr) {
        for (char c : arr) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualArr = manualToCharArray(text);
        char[] builtInArr = text.toCharArray();
        boolean result = compareCharArrays(manualArr, builtInArr);

        System.out.println("\nManual char array: ");
        printCharArray(manualArr);

        System.out.println("Built-in toCharArray(): ");
        printCharArray(builtInArr);

        System.out.println("Comparison result: " + result);

        sc.close();
    }
}
