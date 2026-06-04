import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number N: ");
        int num = sc.nextInt();
        int res = 0;

        int i = 0;
        while (i<num) {
            //System.out.println(i);
            i++;
            res = res+i;
        }
        System.out.println("Sum of All Natural number 1 to "+num +" is = "+res);
        sc.close();
    }
    
}
