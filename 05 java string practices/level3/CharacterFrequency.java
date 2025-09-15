import java.util.Scanner;

public class CharacterFrequency {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];
        int n = text.length();
        for (int i = 0; i < n; i++) {
            char ch = text.charAt(i);
            freq[(int) ch]++;
        }
        int uniqueCount = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0)
                uniqueCount++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                result[index][0] = Character.toString((char) i);
                result[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] frequencyTable = findFrequency(text);
        
        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + "\t\t" + frequencyTable[i][1]);
        }

        sc.close();
    }
}
