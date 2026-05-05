// 10)ATM withdrawal: insufficient balance 
import java.util.Scanner;
class AtmWidrawal {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        int balance = 1000;
        System.out.println("Enter withdrawal Amount");
        int bal = obj.nextInt();

        if (bal <= balance) {
            System.out.println("Account Balence is- " + (balance-bal));
        }
        else
            System.out.println("insufficient balance ");
        obj.close();
    }
    
}
