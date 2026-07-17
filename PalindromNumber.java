import java.util.Scanner;

public class PalindromNumber {
    public static void main (String [] A){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int num = sc.nextInt();
        int originalNum =num;
        int reverse = 0;
        int digit = 0;

        while(num != 0){
            digit = num;
            //System.out.println(num);
            num /= 10;
            digit %= 10;
            //System.out.println(digit);
            reverse = (reverse * 10) + digit;
        }
        //System.out.println(reverse);
        sc.close();
        

        if(originalNum == reverse) {
            System.out.println("Given num "+originalNum+" is palindrome Number");
        }
        else{
            System.out.println("Given num "+originalNum+" is not palindrom number");
        }
    }
}
