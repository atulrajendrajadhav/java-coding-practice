public class StaticDemo{
    static {
        System.out.println("SB 1");
        StaticDemo d = new StaticDemo();
    }
    {
        System.out.println("NSB 1");
    }

    public static void main(String[] args) {
        StaticDemo d = new StaticDemo();

    }
    static{
        System.out.println("SB 2");
    }
    {
        System.out.println("NSB 2");
    }
}