// 6. Calculate and print the sum of the first n natural numbers. 

import java.util.Scanner;

public class SumOfNatualNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int i = 0;
        int count = 0;
        while(i<num){
            //System.out.println(i);
            i++;
            count +=i ;
        }
        System.out.println("Sum of Natural num 1 to "+num + " = "+ count);
        sc.close();
    }
}
