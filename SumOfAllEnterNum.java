// 3. Keep taking numbers from the user until 0 is entered, then print the sum of all 
//entered numbers.
import java.util.Scanner;

public class SumOfAllEnterNum {
    public static void main(String[] args) {
        int i  = 1;
        int sum = 0;
        int num = 0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number ");
            num = sc.nextInt();
            sum+=num;
            System.out.println("Sum of "+num+" "+sum);
            
            
            if(num == 0)return;
            
            i++;
            sc.close();
           
        }while(i<=9);
       

    }
}
