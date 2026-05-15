// 20)write a program to print Level Unlock Game
import java.util.Scanner;
class LevelUnlockGame {
    public static void main ( String [] Atul){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the level");
        int level = obj.nextInt();

        switch (level) { 
        case 1: System.out.println("Level 1 Unlocked"); break; 
        case 2: System.out.println("Level 2 Unlocked"); break; 
        case 3: System.out.println("Boss Level!"); break; 
        default: System.out.println("Invalid Level"); 
        } 
        obj.close();
    }

    
}
