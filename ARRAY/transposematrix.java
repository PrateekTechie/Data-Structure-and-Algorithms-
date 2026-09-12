public class transposematrix {
    public static int[][] transpose(int matrix[][]) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int transposed[][] = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = matrix[i][j];
            }

        }
        return transposed;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 11, 12, 13 },
                { 21, 22, 23 } };
        System.out.println("Transposed matrix:" + transpose(matrix));
    }
}
