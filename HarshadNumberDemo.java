public class HarshadNumberDemo {
    public static boolean isHarshad(int num) {
        int sum = 0;
        int temp = num;

        
        while (temp > 0) {
            sum += temp % 10; // Extract the last digit
            temp /= 10;       // Remove the last digit
        }

        // Return true if the original number is divisible by the sum
        return (num % sum == 0);
    }

  
    public static void main(String[] args) {
        int testNumber = 18;

        if (isHarshad(testNumber)) {
            System.out.println(testNumber + " is a Harshad Number.");
        } else {
            System.out.println(testNumber + " is NOT a Harshad Number.");
        }
    }
}
