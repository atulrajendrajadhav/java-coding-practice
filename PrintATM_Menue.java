//15)Write a program to print ATM menu options
import java.util.Scanner;

class PrintATM_Menue {
    public static void main (String[] Atul){
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the choice");
        int n = obj.nextInt();

        switch (n) {
            case 1:
                System.out.println("Balence");
                break;

            case 2:
                System.out.println("Withdrow");
                break;

            case 3:
                System.out.println("Deposit");
                break;

            case 4:
                System.out.println("Mini Statement");
                break;

        
            default:
                System.out.println("Invalid");
                break;
        }
        obj.close();
    }
}
