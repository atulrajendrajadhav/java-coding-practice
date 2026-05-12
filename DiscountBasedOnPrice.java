import java.util.Scanner;
class DiscountBasedOnPrice {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter th amount");
        int amount = obj.nextInt();

        if (amount>=5000) {
            System.out.println("20% Discount");
        }
        else if (amount>=2000) {
            System.out.println("10% Discount");
        }
        else
            System.out.println("No Discount");
        obj.close();

    }
}
