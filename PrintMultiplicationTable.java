import java.util.Scanner;

public class PrintMultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int multi = 1;

        int  i =0;
        while (i<10) {
            //System.out.println(i);
            i++;
            multi = i*num;
            System.out.println(i+" X "+num +" = "+multi);
        }
        sc.close();
    }
    
}
