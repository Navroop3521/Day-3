import java.util.Scanner;

public class DistanceConverter_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();

        double yards = feet / 3.0;
        double miles = yards / 1760.0;

        System.out.println("The distance in feet is " + feet +
                           ", which is " + yards + " yards" +
                           " and " + miles + " miles.");
        input.close();
    }
}
