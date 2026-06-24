// Create a method that returns the factorial of a number.
import java.util.Scanner;

public class MethodFactorialUsing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int factorial = findFactorial(num);
        System.out.println("Given number "+num+" factorial is "+factorial);
        sc.close();
    }

    public static int findFactorial(int num){
        int fac = 1;
        for(int i=1; i<=num; i++){
           fac = fac*i;
           
        }
        return fac;

    }
}
