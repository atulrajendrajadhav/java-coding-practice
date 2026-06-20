// using Globle variable 
// public class PrintAToZ {
//     static char ch = 'A';
//     public static void main(String[] args) {
//         printChar();
//     }
//     public static void printChar(){
//         System.out.println(ch+" ");
//         if(ch++ =='Z') return;
//         printChar();
//     }
    
// }

// using locale variable
public class PrintAToZ {
    public static void main ( String [] args){
        PrintAToZ('A'); // avlue pass
    }

    public static void PrintAToZ (char ch){
        System.out.println(ch+" ");
        if(ch == 'Z') 
            return;
        PrintAToZ((char)(ch + 1));
      
    }

}

