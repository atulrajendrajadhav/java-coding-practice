//1. Print numbers from Given Range
import java.util.Scanner;
class PrintNumOfGivenRange{
    public static void main(String [] Args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        
        for(int i=0; i<=num; i++)
            System.out.println(i);

        sc.close();
    }

    
}