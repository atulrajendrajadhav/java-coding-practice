import java.util.Scanner;
class SumOfNaturalNum {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int res = 0;

        System.out.println("Sum of "+num+" natural number");
        for(int i=1; i<=num; i++){
    
            System.out.println(i+" ");
            res = res+i;
        }
        System.out.println("Sum of "+num+" natural num is "+res);
    
        sc.close();

    }
}
