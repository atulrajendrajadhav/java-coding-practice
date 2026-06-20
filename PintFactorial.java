public class PintFactorial {
    public static void main(String[] args) {
        int num = 5;
        int fact = findFactoral(num, 1, 1);
        System.out.println(num+" : "+fact);
    }
    public static int findFactoral(int num, int i, int op){
        if(i>num) return op;
        op = op*i;
        return findFactoral(num, ++i, op);
    }
}
