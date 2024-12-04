package Kunal_k;
import java.util.Scanner;
public class AttendanceCalculator {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner sc = new Scanner(System.in);

        // Get the number of total classes from the user
        System.out.print("Total : ");
        int totalClasses = sc.nextInt();

        // Get the number of classes attended from the user
        System.out.print("Present : ");
        int attendedClasses = sc.nextInt();

        // Calculate the attendance percentage
        double attendancePercentage = ((double) attendedClasses / totalClasses) * 100;

        // Display the attendance percentage
        System.out.println("Your attendance percentage is: " + attendancePercentage + "%");

        // Check if the student meets the minimum attendance requirement (e.g., 75%)
        if (attendancePercentage >= 75) {
            System.out.println("You are allowed to sit in the exam.");
        } else {
            System.out.println("Your attendance is too low. You are not allowed to sit in the exam.");
        }
        // Close the scanner
        sc.close();
    }
}


