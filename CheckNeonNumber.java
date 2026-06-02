import java.util.Scanner;

public class CheckNeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int originalNumber = sc.nextInt();
        int square = originalNumber*originalNumber;
        int temp =0;
        int sum =0;


        for(; square!=0; square/=10){
           temp =  square%10;
            sum += temp;
           
        }   
        //System.out.println(sum);

        if (originalNumber == sum) {
            System.out.println(originalNumber+" This given number is Neon number");
        }
        else
            System.out.println("This given number is not Neon number");
        sc.close();
    }
    
    
}
