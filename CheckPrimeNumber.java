import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num =  sc.nextInt();
        int count = 0;

        int i = 0;
        while (i<num) {
            //System.out.println(i);
            i++;

            if (num%i==0) {
                count ++;
            }
        }
        if (count == 2) {
            System.out.println("Given num "+num+" is Prime Number");
        }
        else
            System.out.println("Given num "+num+" is not Prime Number");
        sc.close();
    }
}