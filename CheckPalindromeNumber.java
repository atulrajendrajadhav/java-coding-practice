// Find sum of digits

import java.util.Scanner;

class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
         int num = sc.nextInt();

         int originalNumber = num;
         int temp =0;
         int ReverseANumber = 0;


         while (num>0) {
            temp = num%10;
            num = num/10;
           //System.out.println(temp);

           ReverseANumber =ReverseANumber*10+temp;
         }
         if (originalNumber == ReverseANumber) {
            System.out.println("Given number is Palindrome because Origanl num "+originalNumber+" = "+" revese num "+ReverseANumber);
         }
         else
            System.out.println("Given num "+originalNumber+" is not palindrome ");
        sc.close();
    }

}
    