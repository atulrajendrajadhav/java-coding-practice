import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String [] Args){
        sum1();

        int a = 10;
        int  b = 20;
        int m2 = sum2(a, b);
        System.out.println("Methos 2 o/p is : "+m2);
    }
    // Void method 
    public static void sum1(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 : ");
        int a = sc.nextInt();

        System.out.println("Enter the number 2 : ");
        int b = sc.nextInt();

        System.out.println("Sum of "+a+" & "+b+" = "+(a+b));
        sc.close();
    }

    // non void method
    public static int sum2(int m, int n){
        int sum = m+n;
        return sum;
    }
    
}
