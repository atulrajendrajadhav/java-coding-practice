import java.util.Scanner;

class StringToUpperCase{
     static String str;
    public static void main ( String [] a){
        Scanner sc = new Scanner(System.in);

       
        System.out.println("Enter a string");
        str = sc.next();

        System.out.println("str before: "+str);
        toUppercase();
        System.out.println("str after: "+str);

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
    

   // str = newstr
    
}