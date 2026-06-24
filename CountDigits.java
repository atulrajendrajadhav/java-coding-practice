// Create a method that returns the number of digits in a given number.
public class CountDigits {
    public static void main(String[] args) {
        int num = 384793;
        countDigits(num);
        int cnt = countDigits(num);
        System.out.println("Count of Digit is : "+cnt);
    }

    public static int  countDigits(int num){
        int temp = 1;
        int cnt = 0;
        for(;num !=0; num/=10){
            temp = num%10;
            cnt +=1;
            //System.out.println(temp);
        }
        return cnt; 
    }
}
