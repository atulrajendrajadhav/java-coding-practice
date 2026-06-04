import java.util.Scanner;

public class PrintNumbersFromNTo1 {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number N :");
        int num = sc.nextInt();

        int i = 0;
        while (num >=i ) {
            System.out.println(num);   
            num--;         
        }
       sc.close();
    }
    
}
