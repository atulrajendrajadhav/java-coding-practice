public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime number from 1 to 100 is following ");
        int i = 2;
        while (i<100) {
            boolean isPrime = true;
            i++;
            int j=2;
            while(j <= i/2){
                if(i % j == 0){
                    isPrime = false; //Fond a factor so it is not prime 
                    break; // break inner loop
                }
                j++;
            }

            // if no factors were found, print number
            if(isPrime){
                System.out.print(i+" ");
            }
        }

    }
}
