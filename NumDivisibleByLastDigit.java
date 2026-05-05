// 12)Check if number is divisible by lastdigit or not
import java.util.Scanner;
class NumDivisibleByLastDigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter num");
        int num = obj.nextInt();
        int b = num%10;

        if (num%b == 0) {
            System.out.println(num+" is divisible by "+ b);
        }

        else
            System.out.println(num+" is not divisibe "+b);
        obj.close();
        
    }    
}
