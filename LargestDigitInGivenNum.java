import java.util.Scanner;

public class LargestDigitInGivenNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num= sc.nextInt();
        int temp =0;
    
        int largestDigit =0;

        for(; num!=0; num/=10){
            temp = num%10;

            System.out.println(temp);
            if (temp > largestDigit) {
                largestDigit = temp;

            
        }
        
        }
        System.out.println("Largest dgit of Given num is "+largestDigit);

        sc.close();
    
    }
}
