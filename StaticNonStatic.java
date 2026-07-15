public class StaticNonStatic {
    static int a = 10;
    {
        a = 30;
    }



    // int b = 20;  
    // static{               // error, Non static variable can not initilize in static block 
    //     b = 40;
    // }
    public static void main(String[] args) {
    System.out.println(a);
    StaticNonStatic d = new StaticNonStatic();
    System.out.println(a);
    

    //System.out.println(b); // 
    }
}
