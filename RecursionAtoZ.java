public class RecursionAtoZ {
    static char ch ='A';
    public static void main(String[] args) {
        printChar();
    }
    public static void printChar(){
     System.out.println(ch+" ");
     if(ch++ =='Z') return;
     printChar();
    }
}
