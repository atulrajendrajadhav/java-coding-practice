////////////////////////////////////////////////////////////////////////////
/// Aa Bb Cc Dd
/// Ee Ff Gg Hh
/// Ii Jj Kk Ll
/// Mm Nn Oo Pp
/////////////////////////////////////////////////////////////////
public class Pattern12 {
    public static void main(String[] args) {
        int n=4;
        char ch1 ='A', ch2 = 'a';
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(ch1++ +""+ch2++ +" ");
            }
            System.out.println(" ");
        }
    }
}


