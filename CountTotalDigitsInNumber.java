import java.util.Scanner;

class CountTotalDigitsInNumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int res  = 0;
        int finalResult = 0;
        
        while (num!=0) {
            num/=10;
            //System.out.println(num);
            res = num%10;
            System.out.println(res);
            finalResult ++;

        }
        System.out.println("Total Digit in given number is: "+finalResult);
        sc.close();
    }
}