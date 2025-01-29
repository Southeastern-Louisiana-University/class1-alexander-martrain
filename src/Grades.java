package src;
import java.util.Scanner;
// homework calculate average and display to user
// Then provide a letter grade based on ten point scale

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade = 0;
        double sum = 0;
        double count = 0;
        while (grade >= 0) {
            System.out.println("Please input a grade from 0 to 110 (-1 to terminate");
            grade = input.nextDouble();
            if (grade > 110) {
                System.out.println("Invalid! Must be between 0 and 110.");
            } else {
                sum += grade;
                count++;
            }
        }

//        Scanner scanner = new Scanner(System.in);
//        String yesOrNo;
//
//        do {
//            System.out.println("Enter your grade.");
//            double grade = scanner.nextDouble();
//            if (grade >= 90.0) {
//                System.out.println("A");
//            } else if (grade >= 80.0) {
//                System.out.println("B");
//            } else if (grade >= 70.0) {
//                System.out.println("C");
//            } else if (grade >= 60.0) {
//                System.out.println("D");
//            } else {
//                System.out.println("F");
//            }
//            System.out.println("Would you like to get another grade? Y/N");
//            yesOrNo = scanner.next();
//        } while (yesOrNo.equalsIgnoreCase("Y"));
//
//        scanner.close();
    }
}
