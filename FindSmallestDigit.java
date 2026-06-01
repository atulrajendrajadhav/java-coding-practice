import java.util.Scanner;

public class FindSmallestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int num= sc.nextInt();
        int temp =0;
    
        int smallestDigit =9;

        for(; num>0; num/=10){
            temp = num%10;

            System.out.println(temp);
            if (temp < smallestDigit) {
                smallestDigit = temp;

            
        }
        
        }
        System.out.println("Smallest dgit of Given num is "+smallestDigit);

        sc.close();
    
    }
    
}
