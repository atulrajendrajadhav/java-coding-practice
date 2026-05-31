// Find the sum of first N natural numbers
import java.util.Scanner;
public class SumOfFirstNNaturalNum {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        int res = 0;

        for(int i=0; i<=num; i++){
            //System.out.println(i);
            res = res+i;
        }
        System.out.println(res);
        sc.close();
    }
    
}
