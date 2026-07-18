// 16. Check whether the given number is a Perfect number. 
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number here: ");
        int num = sc.nextInt();
        int originalNum = num;
        int i =1;
        int sum =0;

        while(i<num){
            if(num%i==0){
                System.out.println(i);
                sum += i;
            }
            i++;

        }
        System.out.println("Sum of given num diversor is "+sum);

        if (originalNum == sum) {
            System.out.println("Given number is "+originalNum+" perfect number");
        }
        else
            System.out.println("Given number is "+originalNum+" not Perfect Number ");

        sc.close();
    }
}
