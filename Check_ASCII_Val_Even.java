import java.util.Scanner;
class Check_ASCII_Val_Even {
    public static void main(String[] args) {
        Scanner obj =  new Scanner(System.in);
        System.out.println("Enter Character");
        char ch = obj.next().charAt(0);

        if (ch%2==0) {
            System.out.println(ch + " has an even ASCII value.");
            
        }
        else
            System.out.println(ch + " has an odd ASCII value.");
        obj.close();
    }
}
