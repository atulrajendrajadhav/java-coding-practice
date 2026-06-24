// Create a method that returns the reverse of a number.

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int Reverse = reverseNumber(num);
        System.out.println(Reverse);
        sc.close();
    }
    public static int reverseNumber(int num){
         int rev = 0;
        for(; num!=0; num/=10 ){
            int temp = 0;
    
            temp = num%10;
            rev = (rev*10)+temp;
            //System.out.println(temp);
            
        }
        return rev;
    }
}
