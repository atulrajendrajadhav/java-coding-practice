//9. Calculate and print the factorial of the given number. 
import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int i = 1;
        int factorial = 1;
        do{
            factorial = factorial*i;
            i++;
        }while(i<=num);
        System.out.println("Factorial of given number "+num+" is: "+factorial);
        sc.close();
    }
}
