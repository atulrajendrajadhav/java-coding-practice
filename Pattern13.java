///////////////////////////////////////////////////////
/// a 1 b 2
/// c 3 d 4
/// e 5 f 6
/// g 7 h 8
/// ////////////////////////////////////////////////////
public class Pattern13 {
    
    public static void main(String[] args) {
        int n=4;
        char ch = 'a';
        int a = 1;

        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j%2!=0)
                    System.out.print(ch++ +" ");
                else 
                    System.out.print(a++ +" ");
            }
            System.out.println(" ");
        }
    }
}

