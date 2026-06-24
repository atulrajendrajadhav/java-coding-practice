import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the celsius: ");

        int celsius = sc.nextInt();

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println("Fahrenheit is : "+fahrenheit+"F");
        sc.close();
    }
    public static double celsiusToFahrenheit(double celsius){
        // (0°C × 9/5) + 32 = 32°F

        double fahrenheit  =  (celsius*(9/5)+32);
        return fahrenheit;
    }
}
