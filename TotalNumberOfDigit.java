// 11.  Count and print the total number of digits in a given number. 
import java.util.Scanner;

public class TotalNumberOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int count = 0;

        while(num != 0){
            int temp = num;
            //System.out.println(num);
            count ++;
            num /= 10;
            temp %= 10;
            //System.out.println(temp);
        }
        System.out.println("Total number of dgit of goven num is "+count);
        sc.close();
    }
}
