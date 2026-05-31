// Print Multiplication Table of a Number
import java.util.Scanner;
class MultiplicationTable {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number table");
        int num =sc.nextInt();

        for(int i=1; i<=10; i++){
            System.out.println(i+" X "+num+" = "+ num*i);
        }
        sc.close();
    }
}
