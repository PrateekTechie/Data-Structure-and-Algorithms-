public class diagonalsum {
    public static int printdiagonal(int matrix[][]) { // this solution is the optimise solution of the diagonal sum
                                                      // problem
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            // pd
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) { // ye condition matlab i j ke eqaul nahi hai
                // sd
                sum += matrix[i][matrix.length - 1 - i];

            }

        }
        return sum;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        System.out.println("the sum of the diagonal element is:" + printdiagonal(matrix));
    }
}
