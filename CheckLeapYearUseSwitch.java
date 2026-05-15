// 14)Write a program to check given year is leap year or not using switch 
import java.util.Scanner;
class CheckLeapYearUseSwitch {
    public static void main (String [] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Year");

        int year = obj.nextInt();

        switch (year % 400 ) {
            case 0:
                System.out.println("leap Year");
                break;

            case 1:
                System.out.println("Not Leap year");
        
            default:
                System.out.println("Invalid");
                break;
        }
        obj.close();
    }
}
            