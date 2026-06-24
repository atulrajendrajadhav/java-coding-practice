// Create a method that returns the square of a number.
import java.util.Scanner;
public class SquareOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the number: ");
        int num = sc.nextInt();

        int op = squareOfNumber(num);
        System.out.println("Square of Given num "+num+" is : "+op);
        sc.close();

    }

    public static int squareOfNumber(int num){
        int sqr = num*num;
        return sqr;
    }

}
