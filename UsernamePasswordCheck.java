// 9)Check login where:  username correct  password wrong
import java.util.Scanner;
class UsernamePasswordCheck {
    public static void main (String [] Atul){
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter the Username");
        int user = obj.nextInt();

        System.out.println("Enter the Password");
        int pass = obj.nextInt();
        int username = 808714;
        int password = 123456;


        if (user == username && pass == password) {
            System.out.println("Username and Password are Correct");
        }
        else
        System.out.println("Username Correct but password Wrong");

        obj.close();
    }
    
}
