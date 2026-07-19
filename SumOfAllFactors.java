// 25. Find and print the sum of all factors of the given number. 
import java.util.Scanner;

public class SumOfAllFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n: ");
        int num =sc.nextInt();
        int sum = 0;

        System.out.println("Factors of given "+num+ " is following");
        int i = 1;
        while(i <= num){
            if(num%i==0){
                System.out.println(i);
                sum +=i;
            }
            i++;

        }
        System.out.println("Sum of all factors is "+sum);
        sc.close();
    }
}
