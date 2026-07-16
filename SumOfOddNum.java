// 8. Calculate the sum of all odd numbers from 1 up to n. 

import java.util.Scanner;

public class SumOfOddNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int i = 1;
        int count = 0;
        while(i <= num){
            //System.out.println(i);

            if(i%2 != 0) count += i;
            i++;
        }
        System.out.println("Sum of Odd num 1 to "+num + " = "+ count);
        sc.close();
    }
}
