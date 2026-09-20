package Divideconqure;

public class search {
    public static int searcharray(int arr[], int target, int si, int ei) {

        // base case
        if (si > ei) {
            return -1;
        }
        int mid = ei + (si - ei) / 2;

        // case found
        if (arr[mid] == target) {
            return mid;
        }

        // line 1 case
        if (arr[si] <= arr[mid]) {
            // case a :right
            if (arr[si] <= target && target <= arr[mid]) {
                return searcharray(arr, target, si, mid - 1);
            }
            // case left
            else {
                return searcharray(arr, target, mid + 1, ei);
            }
            // line 2

        }

        else {
            // case a: left
            if (arr[mid] <= target && target <= arr[ei]) {
                return searcharray(arr, target, mid + 1, ei);
                // case b right
            } else {
                return searcharray(arr, target, ei, mid - 1);
            }
        }
    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;
        int taridx = searcharray(arr, target, 0, arr.length - 1);
        System.out.println(taridx);
    }
}
