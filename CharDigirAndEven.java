// 20) Check if char is  digit AND even 
import java.util.Scanner;
public class CharDigirAndEven {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = obj.next().charAt(0);

        if ((ch>=47&&ch<=58)&&(ch%2==0)) {
            System.out.println(ch + " char is  digit AND even .");
            
        }
        else
            System.out.println(ch + " char is digit AND not even ");
        obj.close();
    }
}

    
