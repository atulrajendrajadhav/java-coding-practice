// 9)Battery Level
import java.util.Scanner;
class BatteryLevelUseSwitch {
    public static void main (String []A){
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the Battery Level: ");
        int b = obj.nextInt();

        switch (b/25) {
            case 0:
                System.out.println("Low");
                break;

            case 1:
                System.out.println("Mediaum"); break;
        
            case 2:
                System.out.println("High"); break;

            case 3: 
                System.out.println("Full"); break;
            default:
                System.out.println("Invalid");
                break;
        }

        obj.close();
    }
}
