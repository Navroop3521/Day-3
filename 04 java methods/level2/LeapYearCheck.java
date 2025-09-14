import java.util.Scanner;

public class LeapYearCheck {
    static boolean isLeapYear(int year) {
        boolean conditionA = (year % 4 == 0) && (year % 100 != 0);
        boolean conditionB = (year % 400 == 0);

        return conditionA || conditionB;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        if (year < 1582) {
            System.out.println("Leap year calculation is valid only for year >= 1582.");
            return;
        }

        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is NOT a Leap Year.");
        }
    }
}
