

import java.util.Scanner;

public class NumToWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        String word = NumberToWord(num);
        System.out.println(num + " : " + word);

        sc.close();
    }

    public static String NumberToWord(int num) {
        String word = "";

        while (num != 0) {
            int rem = num % 10;

            word = switch (rem) {
                case 1 -> "one " + word;
                case 2 -> "two " + word;
                case 3 -> "three " + word;

                case 4 -> "four " + word;
                case 5 -> "five " + word;
                case 6 -> "six " + word;

                case 7 -> "seven " + word;
                case 8 -> "eaight " + word;
                case 9 -> "nine " + word;

                default -> word;
            };

            num /= 10;
        }

        return word;
    }
}

