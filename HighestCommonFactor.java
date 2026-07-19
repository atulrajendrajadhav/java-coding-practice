// 25  Find the HCF (Highest Common Factor) of two given numbers.

import java.util.Scanner;

public class HighestCommonFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A: ");
        int num1 = sc.nextInt();

        System.out.println("Enter number B: ");
        int num2 = sc.nextInt();

        int a = num1;
        int b = num2;

        while( b!=0){
            int temp = b;
            b = a%b;
            a = temp;
            
        }
        System.out.println("The HCF of "+num1+" and "+num2+" is: "+a);

        sc.close();
    }
}
