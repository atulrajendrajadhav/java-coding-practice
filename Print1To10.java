//useing the Globle Variable
class Print1To10 {
    static int num =  1;
    public static void main (String [] args){
        printNum();

    }
    public static void printNum(){
        System.out.println(num+" ");
        if(num++ ==10) return ;
        printNum();

    }
}

// using locale variable
// class Print1To10 {
//     public static void main ( String [] args){
//        printNum(1); // value pass


//     }
//     public static void printNum(int num){
//         System.out.println(num+ " ");
//         if( num == 10) 
//             return ;
//         printNum(num + 1);
//     }
// }