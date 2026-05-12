//   Age based ticket price 

import java.util.Scanner;

public class BasedOnAgeTicketPrice {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Age");
        int age = obj.nextInt();

        if(age < 12) 
        System.out.println("Child Ticket"); 
        else if(age <= 60) 
        System.out.println("Adult Ticket"); 
        else 
        System.out.println("Senior Citizen Discount"); 
        
        obj.close();
    }
    
}
