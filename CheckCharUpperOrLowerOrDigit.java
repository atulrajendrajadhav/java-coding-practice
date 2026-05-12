//  WAP to check whether character is uppercase, Lowercase ,Digit or none
import java.util.Scanner;
public class CheckCharUpperOrLowerOrDigit {
   public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the char: ");
        char ch = obj.next().charAt(0);
        if (ch>= 'A' && ch<= 'Z') {
            System.out.println("Upper Case");
        }
        else if (ch>='a' && ch<='z') {
            System.out.println("Lower Casw");
        }
        else if (ch>='1' && ch<='9') {
            System.out.println("Digit");
        }
        else
            System.out.println("Special Character");
        obj.close();
   }
}
