import java.util.Scanner;

public class RecursionFaactorial {
    static int fact=1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");;
        int num = sc.nextInt();
        
        findFactoral(num, 1);
        System.out.println(num+" : "+fact);

        sc.close();
    }
    public static void findFactoral(int num, int i ){
        fact = fact*i;
        if(i++ ==num) return;
        findFactoral(num, i);
    }
}
