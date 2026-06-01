// Count how many even digits are present in a number
import java.util.Scanner;
public class CountEvenDigitOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num= sc.nextInt();
        int temp =0;
        int res =0;

        for(; num!=0; num/=10){
            temp = num%10;

            //System.out.println(temp);

            if (temp%2==0) {
                System.out.println(temp);
                res ++;
            }
        }
        System.out.println("\n"+"Count of Even number in given  "+" is "+res);
        sc.close();
    }
}
