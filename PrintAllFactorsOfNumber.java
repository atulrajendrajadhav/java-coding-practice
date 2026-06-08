import java.util.Scanner;

public class PrintAllFactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int i = 0;
        System.out.println("Factor of given num is: ");
        while (i<=num) {
            //System.out.println(i);
            i++;
            
            if (num%i == 0) {
                System.out.println(i);
            }
        }
        sc.close();
    
    }
    
}
