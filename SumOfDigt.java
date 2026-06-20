public class SumOfDigt {
    public static void main(String[] args) {
        int num = 1234;
        int sum = sumDigits(num);
        System.out.println("Sum of Digits = " + sum);
    }

    public static int sumDigits(int num) {
        if (num == 0)
            return 0;

        return (num % 10) + sumDigits(num / 10);
    }
}