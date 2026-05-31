// Base to Power 
import java.util.Scanner;
class BaseToPower {
    public static void main (String [] A){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Base:");
        int base = sc.nextInt();

        System.out.println("Enter the Power");
        int power = sc.nextInt();

        int res =1;
        for(int i=1; i<=power; i++){
            res = res*base;
        }
        System.out.println("res : "+res);
        sc.close();
    }    
}
