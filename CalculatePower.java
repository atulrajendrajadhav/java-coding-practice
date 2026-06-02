import java.util.Scanner;

public class CalculatePower {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base :");
        int base = sc.nextInt();

        System.out.println("Enter the power: ");
        int power = sc.nextInt();
        long result = 1;

        for (int i=1; i<=power; i++){
            
            result = result*base; // Multiplies the current result by the base
        }
        System.out.println(base + " raised to the power of "+ power + " is: " + result);
        sc.close();
    }

}