import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    public static int[][] generateScores(int numStudents) {
        Random rand = new Random();
        int[][] scores = new int[numStudents][3]; 

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = 40 + rand.nextInt(61); 
            scores[i][1] = 40 + rand.nextInt(61); 
            scores[i][2] = 40 + rand.nextInt(61); 
        }
        return scores;
    }
    public static Object[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        Object[][] results = new Object[numStudents][6];

        for (int i = 0; i < numStudents; i++) {
            int phy = scores[i][0];
            int chem = scores[i][1];
            int math = scores[i][2];
            int total = phy + chem + math;
            double average = total / 3.0;
            double percentage = Math.round((average * 100.0) / 100);

            String grade;
            if (percentage >= 80)
                grade = "A";
            else if (percentage >= 70)
                grade = "B";
            else if (percentage >= 60)
                grade = "C";
            else if (percentage >= 50)
                grade = "D";
            else if (percentage >= 40)
                grade = "E";
            else
                grade = "R";

            results[i][0] = phy;
            results[i][1] = chem;
            results[i][2] = math;
            results[i][3] = total;
            results[i][4] = percentage;
            results[i][5] = grade;
        }

        return results;
    }

    public static void displayResults(Object[][] results) {
        System.out.println("ID\tPhysics\tChemistry\tMath\tTotal\tPercentage\tGrade");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t\t%s\n",
                    (i + 1),
                    results[i][0],
                    results[i][1],
                    results[i][2],
                    results[i][3],
                    results[i][4],
                    results[i][5]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        Object[][] results = calculateResults(scores);
        displayResults(results);

        scanner.close();
    }
}
