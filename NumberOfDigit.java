// 5. Count and print the number of digits in the given number.
import java.util.Scanner;

public class NumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int temp = 0;
        int count = 0;
        do{
            temp = num;
            num/=10;
            temp%=10;
            //System.out.println(temp);
            count ++;
        }
        while(num !=  0);
        System.out.println("Total number of digit in given number is: "+count);
        sc.close();
    }
}
