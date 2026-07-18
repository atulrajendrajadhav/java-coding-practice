import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();

        boolean isPrime = true;
        
        if(num <= 1){
            isPrime = false;
        }
        else{
            int i =2;
            while(i*i <= num){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
                i++;
            }
        }

        if (isPrime) {
            System.out.println(num+" is Prime number");
        }
        else
            System.out.println(num+" is not prime number");

        sc.close();
    }
}
