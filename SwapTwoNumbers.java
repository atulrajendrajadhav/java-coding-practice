// Create a method to swap two numbers and display the result.
public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 200;

        swapNum(a, b);
    }
    public static void swapNum(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swap number is: "+"\n"+"a: "+a +"\n"+"b: "+b);

    }
    
}
