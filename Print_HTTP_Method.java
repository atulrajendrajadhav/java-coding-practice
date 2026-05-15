// 18)Write a program to print HTTP Method operation

import java.util.Scanner;

class Print_HTTP_Method {
    public static void main (String[] Atul){
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the Method");
        String f = obj.next();

        switch (f) {
            case "GET":
                System.out.println("Read ");
                break;

            case "POST":
                System.out.println("Create ");
                break;

            case "PUT":
                System.out.println("Update");
                break;

            case "DELETE":
                System.out.println("DELETE ");

            default:
                System.out.println("Invalid Method");
                break;
        }
        obj.close();
    }
}




