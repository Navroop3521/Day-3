import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int[][] marks = new int[n][3];
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + ": ");
                marks[i][j] = input.nextInt();

                if (marks[i][j] < 0 || marks[i][j] > 100) {
                    System.out.println("Invalid marks! Enter again.");
                    j--; 
                }
            }
        }
        System.out.println("\n--- Student Results ---");
        for (int i = 0; i < n; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += marks[i][j];
            }

            double percentage = (total / 300.0) * 100;
            char grade;

            if (percentage >= 90) grade = 'A';
            else if (percentage >= 75) grade = 'B';
            else if (percentage >= 50) grade = 'C';
            else grade = 'F';
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.println("Physics: " + marks[i][0] +
                               ", Chemistry: " + marks[i][1] +
                               ", Maths: " + marks[i][2]);
            System.out.println("Total: " + total + " / 300");
            System.out.println("Percentage: " + percentage + "%");
            System.out.println("Grade: " + grade);
        }

        input.close();
    }
}
