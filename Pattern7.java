/////////////////////////////////////////////////////////////
/// P O N M
/// L K J I
/// H G F E
/// D C B A
/// ///////////////////////////////////////////////////////////////

public class Pattern7 {
    public static void main(String[] args) {
        int n = 4;
        char ch = 80;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(ch-- +" ");
            }
            System.out.println(" ");
        }
    }
}
