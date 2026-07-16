// 7. Calculate the sum of all even numbers from 1 up to n. 

import java.util.Scanner;

public class SumOfEvenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number N: ");
        int num = sc.nextInt();

        int count  = 0;
        int i = 0;
        while(i <= num){
            //System.out.println(i);
            i++;
            if(i %2 ==0) count +=i;
        }
       System.out.println("Sum of Even num 1 to "+num + " = "+ count);
        sc.close();
    }
    
}
