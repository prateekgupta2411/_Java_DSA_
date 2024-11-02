package day12;

public class Diagonal_Sum_optimation {

    public static int diagonalSum(int matrix[][]) {
        int sum = 0; // O(n)
        for (int i = 0; i < matrix.length; i++) {
            //pd
            sum = sum + matrix[i][i];

            //sd
            // matrix[j] = matrix.length - 1-i;
            if (i != matrix.length - i - 1) {
                sum = sum + matrix[i][matrix.length - 1 - i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        System.out.println(diagonalSum(matrix));
    }
}
