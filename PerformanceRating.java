//  Assign performance rating (Excellent, Good, Average, Poor). 
import java.util.Scanner;
public class PerformanceRating {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = obj.nextInt();

        if (marks>= 90) {
            System.out.println("Excellent");
        }
        else if (marks>=70) {
            System.out.println("Good");
        }
        else if (marks>=50) {
            System.out.println("Average");
        }
        else
            System.out.println("Poor");
        obj.close();
    }
}
