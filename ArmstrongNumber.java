// 15.  Check whether the given number is an Armstrong number.

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the number : ");
        int num = sc.nextInt();
        int origenalNumber = num;
        int temp =0;
        int res = 0;
        int finalRes =0;

        for (; num!=0; num/=10){
            temp = num%10;

            res = temp*temp*temp;
            //System.out.println(res);
            finalRes += res;
        }
        //System.out.println(finalRes);

        if (origenalNumber == finalRes) {
            System.out.println(origenalNumber+" This number is Armstong number");
        }
        else
            System.out.println(origenalNumber+" This is not Amstriong number ");
        sc.close();
    }

}
