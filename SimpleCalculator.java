//4.Write a program to perform basic Simple Calculator
import java.util.Scanner;

public class SimpleCalculator 
{
    public static void main (String [] Args)
    {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Option");
        char option = obj.next().charAt(0);

        System.out.println("Enter the Number 1");
        int a = obj.nextInt();

        System.out.println("Enter the Number 2");
        int b = obj.nextInt();

        switch (option) {
            case '+':
                System.out.println("Addition is: "+(a+b));
                break;
            case '-':
                System.out.println("Substraction is: "+(a-b));
                break;

            case '*':
                System.out.println("Multiplication is: "+(a*b));
                break;

            case '/':
                System.out.println("Division is: "+(a/b));
                break;

            default:
                System.out.println("Invalid");
                break;
        
            }
            obj.close();
    }

    
}
