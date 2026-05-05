// 1)WAP to check given character is alphabet or not 
import java.util.Scanner;
class CharAlphaberCheck{
    public static void main (String [] args ) {
    Scanner obj = new Scanner(System.in);
    
    System.out.println("Enter a Char Alphabet");
    char ch = obj.next().charAt(0);

    if (ch>= 65 && ch<=90){
        System.out.println(ch+" is Alphabet ");
    }
    else
        System.out.println(ch+ " Given char is not alphabet");

    obj.close();
    }
}