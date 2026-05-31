import java.util.Scanner;
public class PrintFactors {
    public static void main (String [] A){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();

        for(int i=1; i<num; i++){
            if (num%i==0) 
            {
                System.out.println(i);
            }
           
        }
        sc.close();

    }
    
}
