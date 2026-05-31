// Check Whether a Number is Prime or Not
import java.util.Scanner;
class NumberIsPrimeOrNot {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int count = 0;

        if (num<=1) {
            System.out.println(num+" is not prime number");
        }

        for(int i=1; i<=num; i++){
            if(num%i == 0){
                count++; // Increase count every time a factor is found
            }
        }
        // A prime number has exactly 2 factors: 1 and itself
        if (count == 2) {
            System.out.println("Given number is prime ");
        }
        else{
            System.out.println("given number is not prime ");}

        sc.close();
    }
}
