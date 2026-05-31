// Count numbers from 1 to N
import java.util.Scanner;
public class CountNum1ToN {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of N : ");
        int num= sc.nextInt();

        for (int i=0; i<=num; i++){
            System.out.println(i+" ");
        }
        sc.close();

    }
}