// )Internet Speed 

import java.util.Scanner;
class InternetSpeedUseSwitch {
    public static void main (String []A){
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the Internet Speed: ");
        int speed = obj.nextInt();

        switch (speed/10) {
            case 0:
                System.out.println("Low");
                break;

            case 1:
                System.out.println("Modurate"); break;
        
            case 2:
                System.out.println("Fast"); break;

            default:
                System.out.println("Ultra Fast");
                break;
        }

        obj.close();
    }
}


