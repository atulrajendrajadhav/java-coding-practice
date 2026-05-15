// 13)write a program to print Direction Based on Input

import java.util.Scanner;
class PrintDirection {
    public static void main (String[] a){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Direction");
        char dir = obj.next().charAt(0);

        switch (dir) {
            case 'N': System.out.println("North");
                break;

            case 'S': System.out.println("South");
                break;

            case 'E': System.out.println("East");
                break;

            case 'W': System.out.println("West");

            default: System.out.println("Invalid");
                break;
        }

        obj.close();
    }
}


