package src;
import java.util.Scanner;
// homework calculate average and display to user
// Then provide a letter grade based on ten point scale

public class loopsReview {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double grade;
        double sum = 0;
        double count = 0;
        while (true) {
            System.out.println("Please input a grade from 0 to 110 (-1 to terminate; 111 to calculate average of all inputted grades).");
            grade = input.nextDouble();

            if (grade == -1) {
                break;
            } else if (grade == 111) {
                if (count == 0) {
                    System.out.println("No grades were entered.");
                } else {
                    double average = sum / count;
                    System.out.printf("""
                            Average Grade: %.2f
                            Letter Grade: %s%n""", average, getLetterGrade(average));
                    System.out.println("Would you like to enter more grades? Y/N");
                    String continueInput = input.next();
                    if (continueInput.equalsIgnoreCase("Y")) {
                        System.out.println("Would you like to clear your previous grades? Y/N");
                        String wipeGrades = input.next();
                        if (wipeGrades.equalsIgnoreCase("Y")) {
                            sum = 0;
                            count = 0;
                        }
                        System.out.println("Please input a grade from 0 to 110 (-1 to terminate; 111 to calculate average of all inputted grades).");
                        grade = input.nextDouble();
                        sum += grade;
                        count++;
                    } else {
                        break;
                    }
                }
            } else if (grade < 0 || grade > 110) {
                System.out.println("Invalid! Must be between 0 and 110.");
            } else {
                sum += grade;
                count ++;
            }
        }
        input.close();
    }

    public static String getLetterGrade(double average) {
        if (average > 100.0) {
            return "A+";
        } else if (average >= 90.0) {
            return "A";
        } else if (average >= 80.0) {
            return "B";
        } else if (average >= 70.0) {
            return "C";
        } else if (average >= 60.0) {
            return "D";
        } else {
            return "F";
        }
    }
}
