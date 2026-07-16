// 3. Print all even numbers between 1 and 100.
public class PrintEvenNum {
    public static void main(String[] args) {
        int num = 1;
        while(num <= 100){
            if(num %2 ==0) System.out.println(num);
            num ++;
        }

    }
}
