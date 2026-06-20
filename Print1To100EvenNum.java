public class Print1To100EvenNum {
    static int num  = 1;
    public static void main(String[] args) {
        isEven();
    }
    public static void isEven(){
        
        if(num > 100) return;

        if(num%2==0)
            System.out.println(num);
        num++;
           
        isEven();
    }
}
