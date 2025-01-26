package src;
import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String yesOrNo;

        do {
            System.out.println("Enter your grade.");
            double grade = scanner.nextDouble();
            if (grade >= 90.0) {
                System.out.println("A");
            } else if (grade >= 80.0) {
                System.out.println("B");
            } else if (grade >= 70.0) {
                System.out.println("C");
            } else if (grade >= 60.0) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.println("Would you like to get another grade? Y/N");
            yesOrNo = scanner.next();
        } while (yesOrNo.equalsIgnoreCase("Y"));

        scanner.close();
    }
}
