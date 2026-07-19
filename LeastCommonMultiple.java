// 27.  Find the LCM (Least Common Multiple) of two given numbers. 
import java.util.Scanner;

public class LeastCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 =  sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();

        int lcm = (num1 > num2)? num1:num2;

        while (true) {
            if (lcm%num1==0 && lcm%num2==0) {
                System.out.println("LCM of "+num1+" and "+num2+" is "+lcm);
                break;
            }
            lcm++;
        }
        sc.close();
    }
}
