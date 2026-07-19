public class SmallestDigit {
    public static void main(String[] args) {
        int num = 47597;

        int tempNum = Math.abs(num);
        if(tempNum == 0){
            System.out.println("The smallest digit is: 0");
            return;
        }
        int smallestDigit = 9;

        while(tempNum > 0){
            int digit = tempNum%10;
            
            if(digit < smallestDigit){
                smallestDigit = digit;
            }
            tempNum = tempNum / 10;
        }
        System.out.println("Smallest digit is "+smallestDigit);
    }
}
  