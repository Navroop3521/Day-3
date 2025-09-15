package level2;

import java.util.Scanner;

public class SplitTextDemo {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            //------------------------------
        }
        return count;
    }

    public static String[] manualSplit(String text) {
        int n = findLength(text);

        int wordCount = 1; 
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        String[] words = new String[wordCount];
        int start = 0, wordIndex = 0;

        for (int i = 0; i < spaceIndexes.length; i++) {
            int end = spaceIndexes[i];
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[wordIndex++] = word.toString();
            start = end + 1;
        }

        StringBuilder lastWord = new StringBuilder();
        for (int j = start; j < n; j++) {
            lastWord.append(text.charAt(j));
        }
        words[wordIndex] = lastWord.toString();

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length)
            return false;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] manualWords = manualSplit(text);
        String[] builtInWords = text.split(" ");
        boolean isSame = compareArrays(manualWords, builtInWords);

        System.out.println("\nManual Split Result:");
        for (String w : manualWords) {
            System.out.println(w);
        }

        System.out.println("\nBuilt-in Split Result:");
        for (String w : builtInWords) {
            System.out.println(w);
        }

        System.out.println("\nAre both results the same? " + isSame);

        sc.close();
    }
}
