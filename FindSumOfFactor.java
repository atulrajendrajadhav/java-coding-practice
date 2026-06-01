import java.util.Scanner;
public class FindSumOfFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the Number");
        int num =sc.nextInt();
        int count = 0;

        for(int i=1; i<=num; i++){
            //System.out.println(i);
            
            if (num%i==0) {
            System.out.println(i);
            count +=i;
            }
            //System.out.println(count);
            sc.close();
        }
        System.out.println("Sum of all Factor is: "+count);
    
    }
    
}
