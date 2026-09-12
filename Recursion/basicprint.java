package Recursion;

import java.util.*;

public class basicprint {

    public static void printdec(int n) {
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n + " ");
        printdec(n + 1);
    }

    public static void printinc(int n) {
        if (n == 1) {
            System.out.println(n + " ");
            return;
        }
        printinc(n - 1);
        System.out.println(n + " ");
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int fnm1 = fact(n - 1);
        int fn = n * fnm1;
        return fn;
    }

    public static int sumnaturalnumber(int n) {
        if (n == 0) {
            return 0;
        }
        int sumnm1 = sumnaturalnumber(n - 1);
        int sn = n + sumnm1;
        return sn;
    }

    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int fnm1 = fib(n - 1);
        int fnm2 = fib(n - 2);
        int fn = fnm1 + fnm2;
        return fn;

    }

    public static boolean issorted(int arr[], int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return issorted(arr, i + 1);
    }

    public static int firstoccunrence(int arr[], int key, int i) {
        if (i == arr.length) { // base case
            return -1;
        }
        if (arr[i] == key) {
            return i;
        }

        return firstoccunrence(arr, key, i + 1);
    }

    public static int lastoccunrence(int arr[], int key, int i) {

        if (i == arr.length) {
            return -1;
        }
        int isfound = lastoccunrence(arr, key, i + 1);
        if (isfound == -1 && arr[i] == key) {
            return i;
        }
        return isfound;
    }


    public static int power(int x,int n) {
        if(n == 0) {
            return 1;
        }
        int xnm1 = power(x,n-1);
        int xn = x * xnm1;
        return xn;
    }

    public static int optimizedpower(int a,int n) {
        // base condition
        if( n == 0) {
            return 1;
        }
        int halfpowerd = optimizedpower(a,n/2) * optimizedpower(a,n/2);

        // for odd no
        if(n % 2 != 0) {
            halfpowerd = a * halfpowerd;

        }
        return halfpowerd;
    }
    public static void main(String args[]) {
       
        System.out.println(optimizedpower(2,5));

        // int n =5;
        // for(int i =n;i>=1;i--) {
        // System.out.println(i);
        // } this is the bruteforce approch now we wil use the recuersion for this
        // calculation
    }
}