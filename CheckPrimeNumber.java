import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println("Given number is Prime: "+num);
        }
        else
            System.out.println("Given number is not Prime : "+num);

        sc.close();
        
    }

    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2; i<num; i++){
            if(num%i==0)
                return false;
        }

        return true;

    }
}