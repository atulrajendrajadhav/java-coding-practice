// 8. Check whether the given number is an Armstrong number. 

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int originalNum = num;
        int digit = 0;
        int count = 0;
        int res = 0;

        do{
            digit = num;
            num/=10;
            digit%=10;
            //System.out.println(digit);
            count = digit*digit*digit;
            res += count;

        }while(num != 0);
        //System.out.println(count);
        //System.out.println(res);

        if (originalNum == res) {
            System.out.println("Given number is armstrong number: "+originalNum+" = "+res);
        }
        else
            System.out.println("Given number is Not armstrong number: "+originalNum+" = "+res);
        sc.close();

    }
}
