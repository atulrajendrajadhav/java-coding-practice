// 17)Check if character is  hex digit 
import java.util.Scanner;
class ChecCharIsHexaOrNot {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter a character");
        char ch = obj.next().charAt(0);

        if ((ch >= '0' && ch <= '9') ||
        (ch >= 'A' && ch <= 'F') ||
        (ch >= 'a' && ch <= 'f')) 
        {
            System.out.println("Given char is Hex digit");
        }
        else
            System.out.println("Given char is not Hex digit");
        obj.close();
    }
}
