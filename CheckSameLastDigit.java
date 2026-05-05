// 5)Check if two numbers have  same last digit 
import java.util.Scanner;
class CheckSameLastDigit {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter a Number 1: ");
        int num1 = obj.nextInt();

        System.out.println("Entera Number 2: ");
        int num2 = obj.nextInt();

        if(num1%10 == num2%10){
            System.out.println("Give number have a same last digit ");
        }
        else
            System.out.println("Not same last Digit ");
        obj.close();
    }    
}
