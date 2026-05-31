// Print cubes of numbers from 1 to N
import java.util.Scanner;
public class CubeOfNumbers1ToN {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number N: ");
        int num = sc.nextInt();
        int res = 0;

        for (int i=1; i<=num; i++){
            //System.out.println(i);
            res = i*i*i;

            System.out.println("Cube of "+i+" is "+res);
        }
        sc.close();
    }
    
}
