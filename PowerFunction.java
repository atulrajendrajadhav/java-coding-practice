// Create a method that calculates base^exponent.
public class PowerFunction {
    public static void main(String[] args) {
        int base = 2;
        int power = 3;
        int output = powerFunction(base, power);
        System.out.println(output);
    }

    public static int powerFunction(int base, int power) {
        int result =1;
        for(int i=0; i<power; i++){
            result *=base;
        }
        return result;
    }
}
