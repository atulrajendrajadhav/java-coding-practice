// Print multiplication table of a number

import java.util.Scanner;
public class PrintMultiplicationTableOfGivenNum {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(num+" X "+i+ " = "+i*num);
        }
        sc.close();
    }
    
}
