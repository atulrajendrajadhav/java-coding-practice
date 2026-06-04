import java.util.Scanner;

public class CountNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();

        int count = 0;

        int i = 0;
        while (i<=num) {
            //System.out.println(i);
            i++;
            count ++;
        }

        System.out.println("Total digit of given number is : "+count);
        sc.close();
    }
    
}
