import java.util.Scanner;

class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        isEvenOdd(num);

        sc.close();
   
    }
    public static int isEvenOdd(int num){
            

            if(num%2==0){
                System.out.println("Given num is Even: "+num);

                return 1;
            }
            else
                System.out.println("Given num is odd: "+num);
                return 0;

        }
        
}