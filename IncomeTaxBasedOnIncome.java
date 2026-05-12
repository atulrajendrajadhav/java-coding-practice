// 1.  Calculate income tax based on different  tax slabs  .
import java.util.Scanner;
class IncomeTaxBasedOnIncome{
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.println("Enter the income");
        int inc = obj.nextInt();

        if (inc<= 250000) {
            System.out.println("No Tax");
        }
        else if (inc <= 500000) {
            System.out.println("5% Tax");
        }
        else if (inc <= 1000000) {
            System.out.println("10% Tax");
        }
        else
            System.out.println("15% tax");

        obj.close();
    }
}