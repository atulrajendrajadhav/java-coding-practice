//  .  Perform operation 1)Addition 2)Substraction 3)Multiplication 4)Division 5)Modulus 

import java.util.Scanner;

class PerformArithmaticOperation{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter your choice 1) Addition 2) Substraction 3) Multiplication");
        int choice = obj.nextInt();

        System.out.println("Enter Num 1: ");
        int num1 = obj.nextInt();

        System.out.println("Enter Num 2: ");
        int num2 = obj.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition: "+(num1+num2));
                break;
            
            case 2:
                System.out.println("Substraction: "+ (num1-num2));
                break;
        
            case 3:
                System.out.println("Multiplication: "+(num1*num2));
                break;

            case 4:
                System.out.println("Division: "+(num1/num2));

            default:
                System.out.println("default Operation");
                break;
        }
        obj.close();

    }
}