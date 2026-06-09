import java.util.Scanner;

public class CheckPerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int originalNumber = num;
        int sum = 0;

        int i = 0;
        while (i < num/2) {
            // System.out.println(i);
            i++;

            if (num % i == 0) {
                //System.out.println(i);
                sum+=i;
            }
            
        }
         System.out.println(sum);

        if (originalNumber == sum) {
            System.out.println("Given num " + originalNumber + " is Perfect Number");
        } else
            System.out.println("Given num " + originalNumber + " is not Perfect Number");

        sc.close();
    }
}
