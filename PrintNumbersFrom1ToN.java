import java.util.Scanner;

class PrintNumbersFrom1ToN {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number N: ");
        int num = sc.nextInt();

        int i =0;
        while (i<=num) {
            System.out.println(i);
            i++;
        }
        sc.close();
    }
}