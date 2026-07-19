// 23. . Print all numbers between a and b that are divisible by 7. 

import java.util.Scanner;

public class DivisibleBy7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the a: ");
        int a = sc.nextInt();
        System.out.print("Enter the b: ");
        int b = sc.nextInt();

        System.out.println("Number is Divisible by 7 is ");
        while(a <= b){
            if(a%7 == 0){
                System.out.println(a);
            }
            a++;

        }
        sc.close();
    }
}
