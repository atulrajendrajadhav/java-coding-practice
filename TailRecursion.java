public class TailRecursion {
    public static void main(String[] args) {
        int num = 20, i= 1;
        findFactors(20, 1
            
        );
    }
    public static void findFactors (int num, int i){
        if(i == num+1) return;
        if(num%i==0) System.out.println(i+ " ");
        i++ ;
        findFactors(num, i);
    }
}
