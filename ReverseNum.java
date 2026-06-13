import java.util.Scanner;

public class ReverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        System.out.println("Original Number: " + num);

        int reverse = toReverse(num);

        System.out.println("Reverse Number: " + reverse);
        sc.close();
    }

    public static int toReverse(int num) {
        int temRev = 0;

        for (; num > 0; num /= 10) {
            int digit = num % 10;
            temRev = temRev * 10 + digit;
        }

        return temRev;
    }
}