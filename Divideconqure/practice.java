package Divideconqure;

public class practice {

    public static void printarr(char arr[]) {
        for(char i =0;i<arr.length-1;i++) {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergesort(char arr[],int si,int ei) {

        ///base case 
        if(si <= ei) {
            return;
        }
        int mid = si + (ei-si)/2; // calulating 
        mergesort(arr,si,mid); // right
        mergesort(arr,mid+1,ei); // left
        merge(arr,si,mid,ei);

    }

    public static int merge(char arr[], int si,int ei,int mid) {
        char temp[] = new char[ei-si+1];
        int i = si;
        int j = mid+1;
        int k =0;
        while(i <= mid && j<=ei) {
            if(arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            }  else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        //remainig the left part

        while(i <= mid) {
            temp[k++] =  arr[i++];

        }
        while(j <= ei) {
            temp[k++] = arr[j++];
        }
        for( k=0,i=si;k<temp.length;k++,i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String args[]) {
         String arr[] = {"sun", "earth", "mars", "mercury"};
        mergesort(arr,0,arr.length-1);
        printarr(arr);

    }
}
