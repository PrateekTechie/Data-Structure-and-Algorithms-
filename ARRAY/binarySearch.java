public class binarySearch {

    public static int binrySearch(int number[], int key) {
        int start = 0, end = number.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid;
            }
            if (number[mid] < key) {
                return mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return -1;
    }

    public static void main(String args[]) {
        int number[] = { 2, 3, 4, 5, 8, 10, 23 };
        int key = 10;
        System.out.println("here is the key value of you search:" + binrySearch(number, key));
    }
}
