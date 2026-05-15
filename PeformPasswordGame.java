// 19)Write a program to perform Password Game

import java.util.Scanner;
class PeformPasswordGame {
    public static void main (String [] Atul){

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the password");
        int password = obj.nextInt(); 
        switch (password) { 

        case 1234: 
            System.out.println("Access Granted"); 
            break; 

        default: 
            System.out.println("Access Denied"); 
            break;
        }
        obj.close();
    }
}
