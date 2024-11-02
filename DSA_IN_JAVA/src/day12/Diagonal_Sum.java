package day12;

public class Diagonal_Sum {
    public static int diagonalSum(int matrix[][]) {
        int sum = 0;// time com = O(n^2)

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                // first diagonal condition
                if (i == j) {
                    sum = sum + matrix[i][j];

                    // second diagonal condition
                } else if (i + j == matrix.length - 1) {
                    sum = sum + matrix[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};
        System.out.println(diagonalSum(matrix));
    }
}
