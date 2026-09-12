public class bubblesort {
    public static void bubble(int arry[]) {
        for (int turn = 0; turn < arry.length - 1; turn++) {
            for (int j = 0; j < arry.length - 1 - turn; j++) {
                if (arry[j] > arry[j + 1]) {
                    int temp = arry[j];
                    arry[j] = arry[j + 1];
                    arry[j + 1] = temp;
                }
            }
        }
    }

    public static void printarr(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i] + " ");

        }
        System.out.println();

    }

    public static void main(String args[]) {
        int arry[] = { 7, 8, 3, 1, 2 };
        bubble(arry);
        printarr(arry);
    }

}
