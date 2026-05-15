// 17)Write a program to print File Extension Type 
import java.util.Scanner;
class PrintFileExtentionType {
    public static void main (String[] Atul){
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the FileType");
        String f = obj.next();

        switch (f) {
            case ".jpg":
                System.out.println("Image File ");
                break;

            case ".mp4":
                System.out.println("Video File ");
                break;

            case ".txt":
                System.out.println("Text File ");
                break;

            default:
                System.out.println("Invalid file");
                break;
        }
        obj.close();
    }
}



