// 4)Check number ends with  0 
import java.util.Scanner;
class CheckNumEndWith0 {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = obj.nextInt();

        if (num%10 ==0) {
            System.out.println(num+" Given num end with 0");
        }
        else
            System.out.println("Given num not end with 0");
        obj.close();
    }
}
