package Divideconqure;
public class quicksort {
    public static void printarr(int arr[]) {
        for(int i =0;i<arr.length;i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void quick(int arr[],int si,int ei) {
        //base case
        if(si >= ei) {
            return;
        }
        //partition
        int pidx = partition(arr,si,ei);
        quick(arr,si,pidx-1);
        quick(arr,pidx+1,ei);
    }

    public static int partition(int arr[],int si,int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for(int j = si;j<ei;j++) {
            if(arr[j] <= pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            } 
            
        }
        i++;
        int temp =  pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }
    public static void main(String args[]) {
        int arr[] = {6,3,9,5,2,8};
        quick(arr,0,arr.length-1);
        printarr(arr);

        }
    }
