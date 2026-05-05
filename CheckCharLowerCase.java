
// 114)Check if character is  lowercase and between 'm'–'z'
import java.util.Scanner;
class CheckCharLowerCase {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a Character");
        char ch = obj.next().charAt(0);

        if ((ch>=97 && ch<=122) && (ch>=109 && ch<=122)) {
            System.out.println("character is  lowercase and between 'm'–'z'");
        }
        else
            System.out.println("Not lowercase and between 'm'–'z'");
        obj.close();

    }
    
}
