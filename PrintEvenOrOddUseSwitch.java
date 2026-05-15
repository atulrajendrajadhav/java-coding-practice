// 11)write a program to print even or off using switch with % 

import java.util.Scanner;
class PrintEvenOrOddUseSwitch{
    public static void main ( String [] A){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = obj.nextInt();

        switch (num%2) {
            case 0:
                System.out.println("Even");
                break;

            case 1:
                System.out.println("Odd");
                break;

        
            default:
                System.out.println("Invalid");
                break;
        }
        obj.close();
    }
}