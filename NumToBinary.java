import java.util.Scanner;

public class NumToBinary {
    static int num  ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num  = sc.nextInt();

        String bin = toBinaryString();
        System.out.println(num+" : "+bin); // cstome imp
        System.out.println(num+" : "+Integer.toBinaryString(num)); // build in


        sc.close();
    }

    public static String toBinaryString(){
        String  bin= "";
        
        for( int i=num; i!=0; i/=2 ){
            int rem = i%2;
            bin = rem+bin;
        }
        return bin;
    }
}
