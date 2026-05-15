// 16)Write a program to print Browser Selection 

import java.util.Scanner;

class PrintBrowserSelection {
    public static void main (String[] Atul){
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the Browser");
        String browser = obj.next();

        switch (browser) {
            case "chrome":
                System.out.println("Open Chrome");
                break;

            case "firefox":
                System.out.println("Open Firefox");
                break;

            case "edge":
                System.out.println("open Edge");
                break;

            default:
                System.out.println("Uncknowen Browser");
                break;
        }
        obj.close();
    }
}


