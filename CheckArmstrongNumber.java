// An Armstrong number is a number that equals the sum of its own digits 
// each raised to the power of the total number of digits. 
// For example, 153 is an Armstrong number because it has 3 digits, 
// and \(1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153\)
public class CheckArmstrongNumber {
    public static void main (String [] Args){

        int num=153;
        int originalNumber =num;
        int digitCount =0;
        int totalSum =0;

        // for loop to count total nuber of digit 
        for(int temp=num; temp!=0; temp/=10){
            digitCount ++;
        }
        

        // 2. For loop to extract digits and calculate the sum of powers
        for(int temp=num; temp!=0; temp/=10){
            int rem = temp%10;
        }
        
        // // Calculate remainder^digitCount manually using a loop
        int powerResult = 1;
        int rem =0;
        for(int i=0; i<=digitCount; i++ ){
            powerResult *= rem;
        }
        totalSum+=powerResult;

        // 3. Compare the sum with the original number
        if ( totalSum== originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        

        
    
    }
    
}
