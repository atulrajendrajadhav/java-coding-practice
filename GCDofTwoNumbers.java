public class GCDofTwoNumbers {
    public static void main (String args[]){
        int num1 = 60;
        int num2  = 36;
       int result =  gcdOfTwonum(num1, num2);
       System.out.println("GCD of "+num1+" and "+num2+" is "+result);

    }

    public static int gcdOfTwonum(int num1, int num2){
        while (num2 != 0) {
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
        
    }
}
