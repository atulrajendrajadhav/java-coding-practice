public class SquareRecursion {

    
    public static void printColumns(int cols) {
        if (cols == 0) {
            return; // Base case: all columns printed
        }
        System.out.print("* ");
        printColumns(cols - 1); // Recursive call for next column
    }

    // Main function to print rows (replaces outer loop)
    public static void printRows(int rows, int size) {
        if (rows == 0) {
            return; // Base case: all rows printed
        }
        printColumns(size);      
        System.out.println();    
        printRows(rows - 1, size); 
    }

    public static void main(String[] args) {
        int n = 5; // Size of the square
        printRows(n, n);
    }
}
