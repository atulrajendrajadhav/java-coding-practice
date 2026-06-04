import java.util.Scanner;

public class FindTheFactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
    System.out.println("Enter the number N: ");
    int num = sc.nextInt();
    int res = 1;

    int i = 0;
    while (i<num) {
        System.out.println(i);
        i++;

        res = res*i;
    }
    System.out.println("Factorial of Given number "+num+" is "+res);
    sc.close();
    }
    
}
