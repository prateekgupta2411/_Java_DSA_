package day12;

public class SearchInSortedMatrix {
    public static void search(int[][] matrix, int key) {
        int row = 0;
        int col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println(row + " , " + col);
                return;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found");
    }

    public static void main(String[] args) {

        int matrix[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50},
        };
        int key = 330;
        search(matrix, key);
    }
}
