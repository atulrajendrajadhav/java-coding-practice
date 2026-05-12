// 10.  Marks classification 
import java.util.Scanner;
public class MarkClassification {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int mark = obj.nextInt();

        if(mark < 35) 
        System.out.println("Fail"); 

        else if(mark < 60) 
        System.out.println("Pass"); 

        else if(mark < 75) 
        System.out.println("First Class"); 

        else 
        System.out.println("Distinction"); 
        obj.close();

    }

}
