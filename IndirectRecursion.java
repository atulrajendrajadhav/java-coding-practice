public class IndirectRecursion {
    static char ch  = 'A';
    static int a = 1;

    public static void main(String[] args) {
        printAlphabets();
        
    }
    public static void printAlphabets (){
        System.out.print(ch++ +" - ");
        if (a == 27) return;
        printNum();
    }
    public static void printNum (){
        System.out.println(a++ +" ");
        if(ch == 27) return;
        printAlphabets();
    }
}
