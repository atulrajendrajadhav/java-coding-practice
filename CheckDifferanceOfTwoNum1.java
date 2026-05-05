// 11)Check if difference of two numbers is  exactly 1 
import java.util.Scanner;
class CheckDifferanceOfTwoNum1 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter num 1: ");
        byte num1 = obj.nextByte();

        System.out.println("Enter num 2: ");
        byte num2 = obj.nextByte();

        if (num1-num2==1 || num2-num1==1) {
            System.out.println(" difference of two numbers is  exactly 1 ");
        }
        else
            System.out.println("difference of two numbers is  more than 1");
        obj.close();
    }
}
