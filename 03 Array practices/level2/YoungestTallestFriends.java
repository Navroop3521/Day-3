import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for " + names[i]);
            System.out.print("Age: ");
            age[i] = input.nextInt();
            System.out.print("Height (in cm): ");
            height[i] = input.nextDouble();
        }

        int youngestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[youngestIndex]) {
                youngestIndex = i;
            }
        }
  
        int tallestIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (height[i] > height[tallestIndex]) {
                tallestIndex = i;
            }
        }
        System.out.println("\n--- Results ---");
        System.out.println("The youngest friend is " + names[youngestIndex] +
                           " with age " + age[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex] +
                           " with height " + height[tallestIndex] + " cm");

        input.close();
    }
}
