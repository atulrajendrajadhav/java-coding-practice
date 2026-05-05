//8)Check if char is  special symbol but printable
import java.util.Scanner;
class CheckSpecialSymbol {
    public static void main (String [] Atul){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the input: ");

        char  ch = obj.next().charAt(0);

        if ((ch>=65 && ch<=90) || (ch>= 97 && ch<= 122) || (ch>=47 && ch<=58)) {
            System.out.println(ch+" This is a Number or Alphabet");
        }
        else
            System.out.println(ch+ " This is Special Character");
        obj.close();
    }   
}
