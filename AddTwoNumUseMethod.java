import java.util.Scanner;

class AddTwoNumUseMethod {
    public static void main ( String [] args){
        int num = 0;
        System.out.println("main Start");
        System.out.println("Sum is: "+addNum(num));
        System.out.println("main Ends");
    }

    public static int addNum(int num){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num 1: ");
        int a= sc.nextInt();
        System.out.println("Enter the num 2: ");
        int b = sc.nextInt();
        int  sum = a+b;
        sc.close();

        return sum;

    }
}