// Check Palindrome Number.
import java.util.Scanner;
public class CheckPalindromeNumber {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num =sc.nextInt();
        int temp = num;
        int lastDigit =0;
        int rev = 0;


        for( ; num!=0; num/=10){
            lastDigit = num%10;
            rev = rev*10+lastDigit;
        }
        System.out.println("rev :"+rev);
        if(rev==temp){
            System.out.println("It is an Pallindrome");
        }else
            System.out.println("not pallindrome");
    
        sc.close();
    }


}
