// 12.  Reverse the given number and print the reversed value.
import java.util.Scanner;

public class ReverseNumber {
    public static void main (String [] A){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int reverse = 0;
        int temp = 1;

        while(num != 0){
             temp = num;
           // System.out.println(num);
            num /= 10;
            temp %= 10;
            //System.out.println(temp);
            reverse = (reverse*10)+temp;
            //System.out.println(reverse);
        }
        System.out.println(reverse);
    
        sc.close();
    }
}
