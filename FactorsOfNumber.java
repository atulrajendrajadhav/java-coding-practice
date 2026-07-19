// 24.  Print all factors of the given number.

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int i = 1;

        System.out.println("Factors of "+num+" is following ");
        while (i <= num) {
            if (num%i == 0) {
                System.out.print(i+" ");
            }
            i++;
        }
        sc.close();
    }
}
