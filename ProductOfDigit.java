public class ProductOfDigit {
    public static void main(String[] args) {
        int num = 1234;
        int pro = proDigits(num);
        System.out.println("Sum of Digits = " + pro);
    }

    public static int proDigits(int num) {
        if (num == 0)
            return 0;

        return (num % 10) + proDigits(num / 10);
    }
}
