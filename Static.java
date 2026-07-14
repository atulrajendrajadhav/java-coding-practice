class Static {
    static int a = 10;
    static int b = 20;

    public static void add(){
        System.out.println(a+b);
    }
    public static void sub(){
        System.out.println(a-b);
    }
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(Static.b);

        Static.add();
        sub();
    }
}