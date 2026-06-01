import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int temp = 0;
        int reverse = 0;

        for (; num != 0; num /= 10) {
            temp = num % 10;
            reverse = reverse * 10 + temp;

            // System.out.println(temp);
        }
        System.out.println(reverse);
        sc.close();
    }
}