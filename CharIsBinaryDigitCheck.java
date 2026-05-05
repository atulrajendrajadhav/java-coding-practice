// 18)Check if character is  binary digit 
import java.util.Scanner;
public class CharIsBinaryDigitCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a character");
        int ch = obj.nextInt();

        if (ch==0 || ch==1) 
        {
            System.out.println("Given character is  binary digit ");
        }
        else
            System.out.println("Given character is not binary digit");
        obj.close();
    }
}

    

