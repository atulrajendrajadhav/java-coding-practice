// WAP to check  given number is even or not, without using % operator 
import java.util.Scanner;
class CheckNumEvenOrNotUseModuls {
    public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);

    System.out.println("Enter the num ");
    int num  = obj.nextInt();

    if ((num/2)*2==num) {
        System.out.println(num+" Given num is even");
    }
    else
        System.out.println(num+ " Given num is odd");

        obj.close();
    }
}
