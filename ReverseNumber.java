// 6. Reverse the given number and print the reversed value. 

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();

        int temp = 0;
        int reversed = 0;
        System.out.print("Given number is: "+num+"\n");
        do{
            temp = num;
            num/=10;
            temp%=10;
            reversed = reversed*10+temp;
            //System.out.println(temp);
        }while(num != 0);

        System.out.print("Reversed number is: "+reversed);
        sc.close();
    }
}
