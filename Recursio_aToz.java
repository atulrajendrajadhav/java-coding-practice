public class Recursio_aToz {
    static char ch = 'a';
    public static void main(String[] args) {
        printAtoZ();
    }
    public static void printAtoZ(){
        System.out.println(ch+" ");
        if(ch++ =='z') return;
        printAtoZ();
    }
    
}
