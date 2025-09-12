public class SpringSeason {

    // Method to check whether the given month and day fall in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        // Check for March (20 to 31)
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        // Check for April (whole month)
        else if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        // Check for May (whole month)
        else if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        // Check for June (1 to 20)
        else if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        // Otherwise not in Spring Season
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        // Taking input from command line arguments
        if (args.length != 2) {
            System.out.println("Please provide month and day as command line arguments.");
            return;
        }

        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Check season and display result
        if (isSpringSeason(month, day)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
