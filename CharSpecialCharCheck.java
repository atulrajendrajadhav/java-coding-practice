// WAP to check given character is special character or not 
import java.util.Scanner;
class CharSpecialCharCheck {
    public static void main (String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a Special Character: ");
        char ch  = obj.next().charAt(0);

        if (ch>=33 && ch<=47) {
            System.out.println(ch+" This is a Special Character");  
        }
        else
            System.out.println(ch+" This is not Special character");

        obj.close();

    }
    
}
