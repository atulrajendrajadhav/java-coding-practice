class ExampleNonStatic{
    static int a=10;
    int b= 20;
    public static void main(String[] args) {
        System.out.println(ExampleNonStatic.a);
        ExampleNonStatic obj = new ExampleNonStatic();
        System.out.println(obj.b);
    }
}