// 7. Check whether the given number is a palindrome. 
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int originalNum = num;
        int temp = 0;
        int reverse = 0;

        do{
            temp = num;
            num/=10;
            temp%=10;
            //System.out.println(temp);
            reverse = reverse*10+temp;
        }while(num != 0);

        //System.out.println(reverse);

        if (originalNum == reverse) {
            System.out.println("Given number is Palindrome because "+originalNum+" == "+reverse);
        }
        else
            System.out.println("Given number is Not Palindrome because "+originalNum+" == "+reverse);
        sc.close();
    }
}
