// 2.  Electricity bill calculation based on  unit slabs  .
import java.util.Scanner;
class ElectricityBillCalculation {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Electricity unit");
        int unit = obj.nextInt();

        if (unit<=100) {
            System.out.println("Low Bill");
        }
        else if (unit<=200) {
            System.out.println("Midium Bill");
        }
        else
            System.out.println("Hight Bill");
        obj.close();
    }
}
