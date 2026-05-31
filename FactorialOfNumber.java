import java.util.Scanner;
class FactorialOfNumber {
    public static void main (String [] Args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = obj.nextInt();

        int res = 1;

        for(int i=num; i>0; i-- ){
            System.out.println(i);
            res = res*i;
        
        }
        System.out.println(res);
        obj.close();
    }
}
