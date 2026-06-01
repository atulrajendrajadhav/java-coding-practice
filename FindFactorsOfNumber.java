public class FindFactorsOfNumber {
    public static void main(String[] args) {
        int num = 12;

        for(int i=1; i<=num; i++){
            //System.out.println(i);
            
            if (num%i==0) {
                System.out.println(i);
            }
        }
    }
    
}
