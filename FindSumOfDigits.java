// Find sum of digits

import java.util.Scanner;

class FindSumOfDigits {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        int temp= 0 ;


        while (num > 0) {
           temp = num %10;
           //System.out.println(temp);
           num = num /10;

            sum += temp; 
           
        }
         System.out.println("Sum of total fiven digit is: "+sum);
         sc.close();
        
    }
}