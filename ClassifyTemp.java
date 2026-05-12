//  Classify temperature as  cold, normal, hot, very hot  .
import java.util.Scanner;
class ClassifyTemp {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the temperature");
        int tem = obj.nextInt();

        if (tem<=10) {
            System.out.println("could temp");
        }
        else if (tem<=20) {
            System.out.println("Midium temp");
        }
        else if(tem<=30){
            System.out.println("Hot temp");
        }
        else
            System.out.println("very high temp");

        obj.close();
    }
    
}
