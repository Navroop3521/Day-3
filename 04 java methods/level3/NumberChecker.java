import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] getDigitsArray(int num) {
        String str = String.valueOf(num);
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrong(int num, int[] digits) {
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[] { largest, secondLargest };
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[] { smallest, secondSmallest };
    }
    public static void main(String[] args) {
        int number = 153;
        int digitCount = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count of digits: " + digitCount);
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(number, digits));

        int[] largestTwo = findLargestAndSecondLargest(digits);
        System.out.println("Largest Digit: " + largestTwo[0]);
        System.out.println(
                "Second Largest Digit: " + (largestTwo[1] == Integer.MIN_VALUE ? "Not Available" : largestTwo[1]));

        int[] smallestTwo = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest Digit: " + smallestTwo[0]);
        System.out.println(
                "Second Smallest Digit: " + (smallestTwo[1] == Integer.MAX_VALUE ? "Not Available" : smallestTwo[1]));
    }
}
