import java.util.Scanner;

public class PerfectNumberUseMethod {
    public static void main(String[] A) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt(); 

        int sum = isPerfectNumber(num);

        if (sum == num) {
            System.out.println(num + " is Perefect Number");
        } else {
            System.out.println(num + " is Not Perfect Number");
        }
        sc.close();
    }

    public static int isPerfectNumber(int num){
        int sum = 0;

        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}

