// Write a program to print Traffic Signal 
import java.util.Scanner;
class TrafficSignalUseSwitch {
    public static void main (String [] a) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the Signal Color");
    String s = obj.nextLine();
    switch (s) {
        case "red":
            System.out.println("Stop");
            break;
    
        case "yellow":
            System.out.println("Wait");
            break;

        case "green":
            System.out.println("Go");
            break;

        default:
            System.out.println("Invalid");
            break;
         }
         obj.close();
    }
}  
    

