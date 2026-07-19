// 22.  Print the cube of each number from 1 to n.

import java.util.Scanner;

public class CubeOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number n");
        int n = sc.nextInt();

        int i = 0;
        while(i <= n){
            System.out.println("Cube of "+i+" is "+(i*i*i));
            i++;
        }
        sc.close();
    }
}
