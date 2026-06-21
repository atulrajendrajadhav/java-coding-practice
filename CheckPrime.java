class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Ener the number");
        int num =new java.util.Scanner(System.in).nextInt();
        String op = isPrime(num, 2)?num+" prime":num+" not prime";
        System.out.println(op);
    }
    public static boolean isPrime(int num, int i ){
        if(num<2 ) return false;
        if(i>num/2) return true;
        if(num%i==0) return false;

        return isPrime(num, ++i);
    }
    public static boolean isPrime2(int num, int i){
        if (num<2 || num%i==0&&num!=2) return false;
        return(i>num/2)?true: isPrime(num, i);
    }
}