import java.util.Scanner;

public class CheckStrongNumber {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number here: ");
        int num = sc.nextInt();
        int originalNumber = num;
        int result = 0;
        int sum =0;

        for(; num!=0; num/=10){
            result = num%10;
            
            int factorial = 1;

            //----------- Nested for loop to calculate the factorial of the digit
            for( int i =1; i<=result; i++){
                //System.out.println(i);
                factorial = factorial*i;
            }
            //System.out.println(factorial);
            sum = sum+factorial;
        }
        
        //System.out.println(sum);

        if (originalNumber == sum) {
            System.out.println(originalNumber+" This given number is Strong number, because sum of the factorial of its individual digits is equal = "+sum);
        }
        else
            System.out.println(originalNumber+" This given number is not Strong number");

        sc.close();

    }
}
