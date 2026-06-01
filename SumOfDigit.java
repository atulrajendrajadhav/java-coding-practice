import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int num = sc.nextInt();
        int res = 0;
        int temp = 0;

        for (; num!=0; num/=10){
            res = num%10;

            System.out.println(res);
            temp +=res;
        }
        System.out.println("Sum of total given num is: "+temp);
        sc.close();
    }
}