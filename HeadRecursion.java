public class HeadRecursion {
    static int a = 1;
    public static void main(String[] args) {
        printNum();
    }
    public static void printNum (){
        if(a++ ==3) return;
        printNum();
        System.out.println(a);
    }
}
