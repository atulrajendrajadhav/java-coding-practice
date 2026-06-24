import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the num 2: ");
        int num2 = sc.nextInt();

        int op = isMaximum(num1, num2);
        System.out.println("Big num is: "+op);
        sc.close();
        
    }

    public static int isMaximum(int a, int b){
        if (a>b) {
            return a;
        }
        else return b;

    }
}
