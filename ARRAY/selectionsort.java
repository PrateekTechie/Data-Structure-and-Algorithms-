public class selectionsort {
    public static void selectionsort(int arry[]) {
        for (int i = 0; i < arry.length - 1; i++) { // outer Loop
            int minPos = i;
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[j] < arry[minPos]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arry[minPos];
            arry[minPos] = arry[i];
            arry[i] = temp;
        }
    }

    public static void printarr(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int arry[]) {
        for (int i =1; i<arry.length;i++) {
            int curr = i;
            int prev = i-1;
            while(prev >=0 && arry[prev] > arry[curr]) {
                arry[prev+1] = arry[prev];
                prev --;
            }
        }
    }

    public static void main(String args[]) {
        int arry[] = { 7, 8, 3, 1, 2 };
        selectionsort(arry);
        printarr(arry);
    }
}
