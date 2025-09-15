import java.util.Scanner;

public class FrequencyUsingUniqueCharacters {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (Exception e) {
            // -----------------------
        }
        return count;
    }

    public static char[] uniqueCharacters(String text) {
        int len = getLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;

        for (int i = 0; i < len; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < i; j++) {
                if (text.charAt(j) == current) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                temp[uniqueCount] = current;
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static String[][] frequencyUsingUnique(String text) {
        char[] uniqueChars = uniqueCharacters(text);
        String[][] freqTable = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char ch = uniqueChars[i];
            int count = 0;

            for (int j = 0; j < getLength(text); j++) {
                if (text.charAt(j) == ch) {
                    count++;
                }
            }

            freqTable[i][0] = Character.toString(ch);
            freqTable[i][1] = Integer.toString(count);
        }

        return freqTable;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        String[][] frequencyTable = frequencyUsingUnique(text);

        System.out.println("\nCharacter\tFrequency");
        System.out.println("--------------------------");
        for (int i = 0; i < frequencyTable.length; i++) {
            System.out.println(frequencyTable[i][0] + "\t\t" + frequencyTable[i][1]);
        }

        sc.close();
    }
}
