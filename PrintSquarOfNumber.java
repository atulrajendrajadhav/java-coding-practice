// Print squares of numbers from 1 to 10
import java.util.Scanner;
public class PrintSquarOfNumber {
    public static void main (String[]args){
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter 1 to last value: ");
        int num = sc.nextInt();
        int res = 0;

        for(int i=0; i<=num; i++){
            //System.out.println(i);
            res = i*i;
            System.out.println("Squar of "+i+" is "+ res);
        }
        sc.close();
    }

}