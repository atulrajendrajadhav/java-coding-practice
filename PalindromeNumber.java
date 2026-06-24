import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        
        int reverse = isPalindrome(num);
        if (num == reverse) {
            System.out.println("Given number "+num+" is Palindrome number");
        }
        else
            System.out.println("Given number "+num+" is not Palindrome number");

        sc.close();
    }

    public static int isPalindrome(int num){
        int temp = 0;
        int rev = 0;
        for(;num!=0;num/=10){
            temp = num%10;
            //System.out.println(temp);

            rev = (rev*10)+temp;
            
        }
        //System.out.println(rev);
        return rev;
    }
   
}
