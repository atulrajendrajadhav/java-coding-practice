// 10. Print the Fibonacci series up to the required number of terms. 

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N: ");
        int num =sc.nextInt();
        int a = 0;
        int b = 1;
        int res = 0;

        int i = 0;
        do{
            res = a+b;
            a=b;
            b=res;
            i++;
        }while(i<= num);
        System.out.println("Fibonacci Series upto "+num+" = "+res);
        sc.close();
    }
}
