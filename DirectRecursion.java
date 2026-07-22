// Direct recursion
public class DirectRecursion  {
    static int a= 1;
    static char ch = 'A';
    public static void main(String[] args) {
        printNum();
        printChar();
       
    }
    public static void printNum(){
        System.out.println(a++ +" "); // 1 2 3 4,...
        if(a == 10) return; // base case
        printNum();
    }

    public static void printChar() {
        System.out.println(ch++ +" ");// A B C 
        if(ch == 91)  return;
        printChar();
    }
}