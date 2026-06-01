import java.util.Scanner;
public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int origenalNumber = num;
        int count = 0;

        for(int i=1; i<num; i++){
            
            if (num%i == 0) {
               //System.out.println(i);
               count +=i;
            }
        }
        if (origenalNumber == count) {
            System.out.println(origenalNumber+" This is a Perfect Number becuase original Number "+origenalNumber+" == Divisor sum  "+count);
        }
        else
            System.out.println(origenalNumber+" This is not perfect number");
        sc.close();
    }
    
}
