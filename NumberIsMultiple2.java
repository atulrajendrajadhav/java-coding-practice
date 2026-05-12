// 8.  Check whether a number is  multiple of 2, 3, 5, or  none  . 
import java.util.Scanner;
public class NumberIsMultiple2 {
    public static void main (String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = obj.nextInt();

        if (n%2==0) {
            System.out.println("multiple of 2");
        }
        else if (n%3==0) {
            System.out.println("multiple of 3");
        }
        else if (n%5==0) {
            System.out.println("multiple of 5");
        }
        else
            System.out.println("None");
        obj.close();
    }
    
}
