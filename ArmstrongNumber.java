import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int addition = isArmstrongNum(num);

        if (num == addition) {
            System.out.println("Given number "+num+" is Armstong Number");
        }
        else
            System.out.println("Given number "+num+" is not Armstong Number");
        sc.close();
    }

    public static int isArmstrongNum(int num) {
        int temp = 0;
        int qub = 0;
        int add = 0;
        for (; num != 0; num /= 10) {
            temp = num % 10;
            qub = temp * temp * temp;
            //System.out.println(qub);
            add+=qub;
        }
        System.out.println(add);
        return add;

    }
}