import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(evenOdd(num));
        sc.close();
    }
    public static int evenOdd(int num){
        if(num%2 == 0) return squar(num);
        else return cube(num);
    }

    public static int squar(int num){
        return num*num;
    }
    public static int cube(int num){
        return num*num*num;
    }
    
}
