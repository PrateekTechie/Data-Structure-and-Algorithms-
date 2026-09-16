package Recursion;

public class binarystring {

    public static void binaryprint(int n, int lastplace, String str) {

        if (n == 0) {
            System.out.println(str);
            return;
        }
        // kaam
        binaryprint(n - 1, 0, str+"0");
        if (lastplace == 0) {
            binaryprint(n - 1, 1, str+"1");

        }

    }

    public static void main(String[] args) {

        binaryprint(3, 0, "");
        

    }
}