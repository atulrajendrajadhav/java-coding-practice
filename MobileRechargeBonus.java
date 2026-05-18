// 15.  Determine mobile recharge bonus based on recharge amount.

import java.util.Scanner;

class MobileRechargeBonus {
    
public static void main (String [] A){
        Scanner obj = new Scanner (System.in);

        System.out.println("Enter the recharge amount ");
        int amount = obj.nextInt();

    if (amount<350) {
        System.out.println("5% Discount");
    }
    else if (amount<700) {
        System.out.println("15% Discount");
    }
    else if (amount<1050) {
        System.out.println("25% Discount");
    }
    else
        System.out.println("30% Discount");

    obj.close();

    }

    
}

