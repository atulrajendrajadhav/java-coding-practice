// Find the factorial of a number
import java.util.Scanner;
public class FactorialOfGivenNum {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        int res =1;

        for(int i=1; i<=num; i++){
            res = res*i;
        }
        System.out.println(num+ " Factorial is: "+res);

        sc.close();
    } 
    
}