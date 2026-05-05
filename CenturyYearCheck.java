// )Check if year is  century year or not  A  century  year  is a year that is  divisible by 100
import java.util.Scanner;
class CenturyYearCheck {
    public static void main(String[] args) {
        Scanner obj = new Scanner (System.in);
        System.out.println("Enter the year");
        int year = obj.nextInt();

        if (year%100 ==0) {
            System.out.println(year +"-Given Year is Century year");
        }
        else
            System.out.println("Given year is not century year");
        obj.close();
    }
}
