public class countingsort {
    public static void countingsort(int arry[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arry.length; i++) {
            largest = Math.max(largest, arry[i]);
        }
        int count[] = new int[largest + 1];
        for (int i = 0; i < arry.length; i++) { // this loop is used to count the frequency of the each element in thr
                                                // array and store it in the count array
            count[arry[i]]++;
        }
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arry[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void printarr(int arry[]) {
        for (int i = 0; i < arry.length; i++) {
            System.out.println(arry[i] + " "); // here is the freqency in the array is printed in the sorted order

        }
        System.out.println();
    }

    public static void main(String args[]) {
        int arry[] = { 7, 8, 3, 1, 2 };
        countingsort(arry);
        printarr(arry);
    }
}
