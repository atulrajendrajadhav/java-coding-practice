import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number N: ");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
       
        System.out.println("Fibonacci Series upto "+num+" is "+fibonacciSeries(a, b, num));
        sc.close();
    }
    public static int fibonacciSeries(int a, int b, int num){
        int res = 0;
        for(int i=0; i<num; i++){
            //System.out.println("Fibonacci Series upto "+num+" is "+a);
            res = a+b;
            a=b;
            b=res;
        }
        return a;
    }
}
