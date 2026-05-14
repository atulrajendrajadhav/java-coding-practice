// 6)Write a program to print vowel or consonant using switch 
import java.util.Scanner;
class VowelOrConsonantUseSwitch {
  public static void main (String [] A){
    Scanner obj = new Scanner (System.in);
    System.out.println("Enter the Alphabet");
    char ch = obj.next().charAt(0);

    switch (ch) {
        case 'a','e','i','o','u':
            System.out.println("Give Alphabetis is vowel: "+ch);
            break;
    
        default:
            System.out.println("Given Alphabetis consonant: "+ch);
            break;
    }
    obj.close();

  }  
}
