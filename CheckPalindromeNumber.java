import java.util.Scanner;
public class CheckPalindromeNumber {
    public static void main (String [] Args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number N: ");
        int num = sc.nextInt();
        int origenalNumber = num;
        int temp =0;
        int reverse =0;

        for (; num!=0; num/=10){
            temp = num%10;

            reverse = reverse*10+temp;
            //System.out.println(reverse);
        }
        //System.out.println(reverse);

        if(origenalNumber == reverse){
            System.out.println(origenalNumber+ " This number is Palindrome Number");
        }
        else
            System.out.println(origenalNumber+" This number is not  palindrome Number");

        sc.close();
    }
}
