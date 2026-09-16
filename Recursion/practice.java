package Recursion;

public class practice {
    public static void firstoccurence(int arr[], int key, int i) {
        // base case
        if (i == arr.length) {
            return;
        }

        // kaam
        if (arr[i] == key) {
            System.out.println(i + "");

        }

        firstoccurence(arr, key, i + 1);
    }

    public static void numberconverter(int n) {
        if(n == 0) {
            return;
        }

        int digit = n % 10; // isse last digit mil jayega
        numberconverter(n/10);


        switch(digit) {
            
            case 1:
            System.out.println("one");
            break;
            case 2:
            System.out.println("two");
            break;
            case 3:
            System.out.println("three");
            break;
            case 4:
            System.out.println("four");
            break;
            case 5:
            System.out.println("five");
            break;
            case 6:
            System.out.println("six");
            break;
            case 7:
            System.out.println("seven");
            break;
            case 8:
            System.out.println("eight");
            break;
            case 9:
            System.out.println("nine");
            break;
            case 10:
            System.out.println("zero");
            break;
        }

         

    }


    public static int length(String str) {
        if(str.length() == 0) {
            return 0;
        }
        return length(str.substring(1)) +1;
    }


    public static int countsubstr(String str ,int i,int j,int n) {
        if( n == 1) {
            return 1;
        }
        if(n <= 0) {
            return 0;
        }
        int res = countsubstr( str ,i+1,j,n-1)+
                countsubstr( str,i,j-1,n-1) -
                countsubstr(str,i+1,j-1,n-2);

                if(str.charAt(i) == str.charAt(j)) {
                      res++;
                }
                return res;
    }
    public static void main(String args[]) {

        String str = "abcab";
        int n = str.length();
        System.out.println(countsubstr(str,0,n-1,n));
        
    }

}