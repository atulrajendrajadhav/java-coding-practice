//19. Print the Fibonacci series up to n terms. 

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
       int num = sc.nextInt();

       int a = 0;
       int b = 1;

       int i = 0;
       int res =0;
       while(i <= num){
        res = a+b;
        
        a=b;
        b=res;
        i++;

       }
       System.out.println(res);
       sc.close();
    }
}