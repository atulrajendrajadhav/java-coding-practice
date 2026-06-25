public class LCMofTwoNumbers {
     public static void main(String[] args) {

        int num1 = 60;
        int num2 = 36;

        int result = lcmOfTwoNum(num1, num2);

        System.out.println("LCM of " + num1 + " and " + num2 + " is " + result);
    }

    public static int lcmOfTwoNum(int num1, int num2) {

        int a = num1;
        int b = num2;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        int gcd = a;

        return (num1 * num2) / gcd;
    }
}
