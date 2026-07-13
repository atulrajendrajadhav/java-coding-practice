public class ExNonStaticMethod {
    public static void add(){
        System.out.println(10+20);
    }
    void sub(){
        System.out.println(10-20);
    }

    public static void main(String[] args) {
        ExNonStaticMethod.add();

        ExNonStaticMethod obj= new ExNonStaticMethod();
        obj.sub();
    }
}
