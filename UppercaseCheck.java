// 13)Check if character is  uppercase but not a vowel 
import java.util.Scanner;
class UppercaseCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = obj.next().charAt(0);

        if ((ch>= 65 && ch<=90) && !(ch ==65||ch==69||ch==73||ch==79||ch==85)) {
            System.out.println(ch+"character is  uppercase but not a vowel ");
        }
        else
            System.out.println("character is  uppercase and a vowel ");
        obj.close();
    }
    
}
