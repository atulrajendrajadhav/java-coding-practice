// 12.  Categorize internet speed into  Slow, Moderate, Fast,  Ultra-Fast  . 
import java.util.Scanner;
class InternetSpeed {
    public static void main (String [] A){
        Scanner obj = new Scanner (System.in);

        System.out.println("Enter the Internet speed ");
        int speed = obj.nextInt();

    if (speed<10) {
        System.out.println("Slow");
    }
    else if (speed<20) {
        System.out.println("Moderate");
    }
    else if (speed<30) {
        System.out.println("Fast");
    }
    else
        System.out.println("Ultra Fasst");

    obj.close();

    }

    
}
