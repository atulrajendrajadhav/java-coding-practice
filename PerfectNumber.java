import java.util.Scanner;

class PerfectNumber {
    public static void main(String[] A) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is Perefect Number");
        } else {
            System.out.println(num + " is Not Perfect Number");
        }
        sc.close();
    }

}