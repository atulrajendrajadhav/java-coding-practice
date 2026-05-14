// Write a program to perform even and odd operation using switch 
import java.util.Scanner;
class EvenAndOddUseSwitch {
  public static void main(String[] args) {
    Scanner obj = new Scanner (System.in);
    System.out.println("Enter the Input ");
    int n = obj.nextInt();

    switch (n%2) {
        case 0: System.out.println("Even");
            break;

        case 1: System.out.println("Odd");
        break;
    
        default: System.out.println("Invalid");
            break;
    
        }

        obj.close();
  } 

}
