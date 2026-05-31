// ount total digits in a number
import java.util.Scanner;
public class CountTotalDigit1ToN {
    public static void main (String [] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number N: ");
        int num = sc.nextInt();
        int res = 0;

        for(int i=1; i<=num; i++){
            System.out.println(i);
            res ++;

        }
        System.out.println("\n"+"Total sum "+res);
        sc.close();
    }
    
}
