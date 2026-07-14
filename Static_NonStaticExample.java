
public class Static_NonStaticExample {
    static int a = 1;
    int b = 2;

    static{
        System.out.println("SB1");
        a =5;
    }
    {
        System.out.println("NSB1");
        b = 23;
    }
    static{
        System.out.println("SB2");
        a = 8;
    }

    public static void main(String[] args) {
        Static_NonStaticExample d = new Static_NonStaticExample();

        System.out.println(Static_NonStaticExample.a);
        System.out.println(d.b);

        Static_NonStaticExample d1 = new Static_NonStaticExample();
    }
    {
        System.out.println("NSB2");
        System.out.println(b);
    }
    static{
        System.out.println("SB3");
        System.out.println(a);
    }
    {
        System.out.println("NSB3");
        b = 48;
    }

    
}