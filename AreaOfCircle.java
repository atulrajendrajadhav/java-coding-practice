//Create a method that calculates the area of a circle.
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Radious of Circule ");
        int num =sc.nextInt();

        double op = areaOfCircle(num);
        System.out.println("Area of circle of given num "+num+" is "+op);
        sc.close();
    }

    public static double areaOfCircle(int num){
        //pi*r^2
        return 3.14* num*num;
        

    }
}
