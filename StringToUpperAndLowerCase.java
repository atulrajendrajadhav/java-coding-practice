import java.util.Scanner;

class StringToUpperAndLowerCase {
    static String str;
    public static void main ( String [] a){
        Scanner sc = new Scanner(System.in);

       // Calling to Upper case method.
        System.out.println("Enter a string to convert into Upper Case");
        str = sc.next();

        System.out.println("str before: "+str);
        toUppercase();
        System.out.println("str after: "+str);

        // Calling to lower case method
        System.out.println("Enter a String to convert into Lower Case");
        str = sc.next();

        System.out.println("str before: "+str);
        toLowerCase();
        System.out.println("str after: "+str);

        sc.close();

    }


    public static void  toUppercase(){
        String newstr = "";

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch>=97 && ch<=122) {
                newstr += (char)(ch-32);
            }
            else
                newstr += ch;
        }
        str = newstr;
    }

    public static void  toLowerCase(){
        String newstr = "";

        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);

            if (ch>=65 && ch<=90) {
                newstr += (char)(ch+32);
            }
            else
                newstr += ch;
        }
        str = newstr;
        

    }


    
}