// 9. Calculate and print the factorial of a given number.

import java.util.Scanner;

public class FactorialOfGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= num) {
            factorial = factorial * i; 
            i++;
        }
        System.out.println("Factorial of given num "+num+" is "+factorial);
        sc.close();
        
    }
}
