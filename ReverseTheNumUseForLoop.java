import java.util.Scanner;
class ReverseTheNumUseForLoop {
    public static void main(String[]a){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev=0;

        for(; num!=0; num/=10){
            //System.out.println(num);

            int digit= num%10;
            rev=rev*10+digit;
        }
        System.out.println(rev);
        sc.close();
    }
    
}
