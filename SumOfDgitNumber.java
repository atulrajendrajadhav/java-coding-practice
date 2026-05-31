// Find Sum of Digits of a Number.
import java.util.Scanner;
public class SumOfDgitNumber {
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        int res=0;
        int temp=0;

        for(; num!=0; num/=10){
            //System.out.println(num);
            temp = num%10;
            System.out.println(temp);
            res = res+temp;

        }
        System.out.println(res);
        sc.close();
        
    }
    
}
