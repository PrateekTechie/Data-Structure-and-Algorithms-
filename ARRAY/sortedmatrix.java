public class sortedmatrix {

    public static void vapis(int arry[][]) {
        int count = 0;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry[i].length; j++) {
                if (arry[i][j] == 7) {
                    count++;
                }
            }

        }
        System.out.println("the count of 7 is: " + count);
    }

    public static void main(String args[]) {
        int matrix[][] = {
                { 4, 7, 8 },
                { 8, 8, 7 }
        };
        vapis(matrix);
    }
}
// public static boolean staircasesearch(int matrix[][], int key) {
// int row = 0;
// int col = matrix[0].length - 1;
// while (row < matrix.length && col >= 0) {
// if (matrix[row][col] == key) {
// System.out.println("Key found at index: (" + row + "," + col + ")");
// return true;
// } else if (key < matrix[row][col]) {
// col--;

// } else {
// row++;
// }
// }
// System.out.println("key not found");
// return false;
// }

// public static void main(String args[]) {
// int matrix[][] = { { 10, 20, 30, 40 },
// { 15, 25, 35, 45 },
// { 27, 29, 37, 48 },
// { 32, 33, 39, 50 } };
// staircasesearch(matrix, 33);
// }
