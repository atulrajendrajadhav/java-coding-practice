
import java.util.Arrays;

public class CharToArray {
    static String str = "ABCDEFGH";

    public static void main(String[] args) {
        System.out.println(str);
        char[] arr1 = toCharArray();
        System.out.println(Arrays.toString(arr1));

    }

    public static char[] toCharArray() {
        char[] arr = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[i] = ch;
        }
        return arr;

    }
}
