public class NonStaticDemo {
    static{
        System.out.println("SB1");
    }
    {
        System.out.println("NSB1");
    }

    public static void main(String[] args) {
        NonStaticDemo d = new NonStaticDemo();

    }
    static {
        System.out.println("SB2");
    }
    {
        System.out.println("NSB2");
        NonStaticDemo d = new NonStaticDemo(); // Stack Ovwerflow error 
    }
}
