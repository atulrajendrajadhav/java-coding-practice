import java.util.Scanner;

class CheckLeapYear {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a year i/p: ");
        int year = obj.nextInt();
        if ((year%4==0 && year%100!=0) || year%400==0) {
            System.out.println("This is a Leap year");
        }
        else
            System.out.println("This is not leap year");
        obj.close();
    }
    
}
