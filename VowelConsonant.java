import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Characyer: ");
        char ch = sc.next().charAt(0);

        String result = checkVowelConsonant(ch);

        System.out.println("Character: " + ch);
        System.out.println("Result: " + result);
        sc.close();
    }

    public static String checkVowelConsonant(char ch) {

        ch = Character.toLowerCase(ch);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        } else {
            return "Consonant";
        }
    }
}

