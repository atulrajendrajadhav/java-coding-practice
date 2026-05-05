//Check if char is  digit but not '0'  
import java.util.Scanner;

public class CharIsDigitNot0 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the char  ");
        int ch = obj.nextInt();

        if ((ch<=1 && ch>=9) || ch !=0) {
            System.out.println("This is digit and not a not 0");
        }
        else
            System.out.println("char is zero");
        
        obj.close();
    }
    
}
