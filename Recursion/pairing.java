package Recursion;

public class pairing {

    public static int friendsparing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        int fnm1 = friendsparing(n - 1);
        int fnm2 = friendsparing(n - 2);
        int pairways = (n - 1) * fnm2;
        int totalways = fnm1 + pairways;
        return totalways;
    }

    public static void main(String args[]) {
        System.out.println(friendsparing(3));

    }

}
