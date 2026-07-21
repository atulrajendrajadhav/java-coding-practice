// 2. Print the multiplication table of a given number. 
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Number: ");
    int num = sc.nextInt();

    int i = 1;
    do{
        System.out.println(num+" X "+i+" = "+num*i);
        i ++;
    }while(i<=10);

    sc.close();
    }


}
