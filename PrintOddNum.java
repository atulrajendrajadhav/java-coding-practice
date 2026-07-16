// Print all odd numbers between 1 and 100. 
public class PrintOddNum {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 100){
            if(num%2 != 0) System.out.println(num);
            num ++;
        }
    }
    
}
