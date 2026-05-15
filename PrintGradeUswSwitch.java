// 12)write a program to print Grade (Character Input)
import java.util.Scanner;
class PrintGradeUswSwitch {
    public static void main (String[] a){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Grade");
        char g = obj.next().charAt(0);

        switch (g) {
            case 'A': System.out.println("Excellent");
                break;

            case 'B': System.out.println("Good");
                break;

            case 'c': System.out.println("Average");
                break;

            default: System.out.println("Poor");
                break;
        }

        obj.close();
    }
}
