import java.util.Scanner;

public class PrintAllEvenNumbersFrom1ToN {
    public static void main(String[] args) {

        System.out.println("Enter the number N: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int i = 0;
        while (i <= num) {
            // System.out.println(i);
            i++;
            if (i % 2 == 0) {
                System.out.println("Even number from 1 to " + num + " is " + i);
            }
        }
        sc.close();

    }
}
