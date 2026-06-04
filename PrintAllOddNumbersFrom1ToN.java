import java.util.Scanner;

public class PrintAllOddNumbersFrom1ToN{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter the number N: ");
        int num = sc.nextInt();

        int  i = 0;
        while (i<=num) {
            i++;
            //System.out.println(i);
            if (i%2 != 0) {
                System.out.println("Odd number from 1 to "+num+" is "+i);
            }
        }
        sc.close();

    }
    
}
