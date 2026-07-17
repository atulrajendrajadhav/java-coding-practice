// 10. Find and print the product of all digits of a given number. 
import java.util.Scanner;

public class ProductOfAllDigit {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int temp = 0;
        int product = 1;
        while(num != 0){
            //System.out.println(num);
            temp = num;
            num /= 10;

             temp %= 10;
            System.out.println(temp);
            product = temp * product;  
        }
        System.out.println("Product of given digit is "+product);
        sc.close();
    }
}