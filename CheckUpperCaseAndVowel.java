// 16)Check if character is  uppercase vowel only 
import java.util.Scanner;
class CheckUpperCaseAndVowel {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = obj.next().charAt(0);

        if ((ch>= 65 && ch<=90) && (ch ==65||ch==69||ch==73||ch==79||ch==85)) {
            System.out.println(ch+" character is  uppercase and vowel only  ");
        }
        else
            System.out.println("not character is  uppercase and vowel only  ");
        obj.close();
    }
    
}


    

