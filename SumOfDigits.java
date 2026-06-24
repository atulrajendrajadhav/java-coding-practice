import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int sum = sumOfDigit(num);
        System.out.println("Sum of given num is "+sum);
        
    }
    public static int  sumOfDigit(int num){
        int temp = 0;
        int op = 0;
        for(;num!=0; num/=10){
            temp= num%10;
            //System.out.println(temp);
            op = op+temp;
           // System.out.println(op);
        }
        return op;
    }
}
