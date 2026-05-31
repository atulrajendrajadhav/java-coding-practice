//Print Even number
import java.util.Scanner;
public class PrintEvenNumGiveRange {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int i=0; i<=num; i++){
            //System.out.println(i);
            if(i%2==0){
                System.out.println(i+" is Even number");
            }
        }
        sc.close();
        
    }
}
