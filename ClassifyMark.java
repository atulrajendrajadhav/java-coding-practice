// 14.  Classify marks into  Fail (<35), Pass, First Class,  Distinction  . 

import java.util.Scanner;

class ClassifyMark {
    public static void main (String [] A){
        Scanner obj = new Scanner (System.in);

        System.out.println("Enter Marks here: ");
        int mark = obj.nextInt();

    if (mark<35) {
        System.out.println("Fail");
    }
    else if (mark<60) {
        System.out.println("pass");
    }
    else if (mark<80) {
        System.out.println("First Class");
    }
    else
        System.out.println("Distinction");

    obj.close();

    }

    
}

    
