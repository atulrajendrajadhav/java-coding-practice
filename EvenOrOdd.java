import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        isEvenOrOdd();

        int num= 4;
         if (isEvenOrOdd2(num)) {
            System.out.println("Given num is Even "+ num);
        }
        else
            System.out.println("Given num is Odd "+num);
    }
    // Methos 1 void
    public static void isEvenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        if (num%2==0) {
            System.out.println("Given num is Even: "+num);
        }
        else 
            System.out.println("Given num is Odd: "+num);
        sc.close();
    }
    // Method 2 Non void
    public static  boolean isEvenOrOdd2(int num){
       return num%2==0;
    }
}
