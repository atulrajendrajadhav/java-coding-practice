//Print Fibonacci series up to N terms
import java.util.Scanner;
public class PrintFibonacciSeriesUptoN {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number n: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;

        for(int i=0; i<=num; i++){
            System.out.println("Fibonacci Series upto "+num+" is "+a);

            int res = a+b;
            a=b;
            b=res;
  
        }
        sc.close();
    }
    
}
