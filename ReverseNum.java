public class ReverseNum {
    public static void main(String[] args) {
        int num = 1234;
        int rev = ReverseNum(num, 0);
        System.out.println(num+" : "+rev);
    }

    public static int ReverseNum (int num,  int rev) {
        if(num==0) return rev;
        rev = rev*10+(num%10);
        return ReverseNum(num/10, rev);
    }
}


