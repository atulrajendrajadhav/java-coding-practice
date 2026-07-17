// 14. Find and print the sum of digits of the given number. 

import java.util.Scanner;

public class SumOfDigit {
    public static void main ( String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int digit = 0;
        int count = 0;

        while(num != 0){
            digit = num;
            //System.out.println(num);
            num /= 10;
            digit %= 10;
            System.out.println(digit);
            count = count + digit;
        }
        System.out.println("Sum of all Given digit is "+count);
        sc.close();
    }
}
