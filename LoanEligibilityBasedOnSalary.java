// 7.  Determine loan eligibility based on salary range
/*₹15,000 – ₹25,000/month: ₹10 Lakhs – ₹18 Lakhs
₹30,000 – ₹40,000/month: ₹20 Lakhs – ₹30 Lakhs
₹50,000 – ₹60,000/month: ₹32 Lakhs – ₹45 Lakhs
₹75,000+ /month: ₹50 Lakhs+*/

import java.util.Scanner;
public class LoanEligibilityBasedOnSalary {
    public static void main (String [] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the salary");
        int sal = obj.nextInt();

        if (sal>15000 && sal<25000) {
            System.out.println("Loan Amount: ₹10 Lakhs – ₹18 Lakhs");
        }
        else if(sal>30000 && sal<40000){
            System.out.println("Loan Amount: ₹20 Lakhs – ₹30 Lakhs");
        }
        else if (sal>50000 && sal<60000) {
            System.out.println("Loan Amount: ₹20 Lakhs – ₹30 Lakhs");
        }
        else{
            System.out.println("Loan Amount: ₹50 Lakhs+");
        }

        obj.close();
    }
    
}
